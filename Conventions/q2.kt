// Q2:Ranges
// Using ranges implement a function that checks whether the date is in the range between the first date and the last date (inclusive).
// You can build a range of any comparable elements. In Kotlin in checks are translated to the corresponding contains calls and .. to rangeTo calls:
val list = listOf("a", "b")
"a" in list  // list.contains("a")
"a" !in list // !list.contains("a")

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

date1..date2 // date1.rangeTo(date2)

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
  return date in first..last
}
