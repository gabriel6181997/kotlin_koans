// Q3:For loop
// A Kotlin for loop can iterate through any object if the corresponding iterator member or extension function is available.
// Make the class DateRange implement Iterable<MyDate>, so that it can be iterated over. Use the function MyDate.followingDate() defined in DateUtil.kt; you don't have to implement the logic for finding the following date on your own.
// Use an object expression which plays the same role in Kotlin as an anonymous class in Java.

import java.util.Calendar

fun MyDate.followingDate(): MyDate {
    val c = Calendar.getInstance()
    c.set(year, month, dayOfMonth)
    val millisecondsInADay = 24 * 60 * 60 * 1000L
    val timeInMillis = c.timeInMillis + millisecondsInADay
    val result = Calendar.getInstance()
    result.timeInMillis = timeInMillis
    return MyDate(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DATE))
}

data class MyDate (val year: Int, val month: Int, val dayOfMonth: Int): Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        if (year != other.year) {
            return year - other.year
        }
        if (month != other.month) {
            return month - other.month
        }
        return dayOfMonth - other.dayOfMonth
    }
}

operator fun MyDate.rangeTo(other: MyDate): DateRange = DateRange(this, other)

class DateRange(val start: MyDate, val end: MyDate):Iterable<MyDate> {
  override fun iterator():Iterator<MyDate> {
      return object: Iterator<MyDate> {
          var current: MyDate = start

          override fun next(): MyDate {
              if(!hasNext()) throw NoSuchElementException()
              val result = current
              current = current.followingDate()
              return result
          }
          override fun hasNext():Boolean = current <= end
      }
  }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
  for (date in firstDate..secondDate) {
      handler(date)
  }
}
