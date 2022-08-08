// Q4 Operators overloading
// Implement date arithmetic and support adding years, weeks, and days to a date. You could write the code like this: date + YEAR * 2 + WEEK * 3 + DAY * 15.
// First, add the extension function plus() to MyDate, taking the TimeInterval as an argument. Use the utility function MyDate.addTimeIntervals() declared in DateUtil.kt
// Then, try to support adding several time intervals to a date. You may need an extra class.

import java.util.Calendar

fun MyDate.addTimeIntervals(timeInterval: TimeInterval, amount: Int): MyDate {
  val c = Calendar.getInstance()
  c.set(year + if(timeInterval == TimeInterval.YEAR) amount else 0, month, dayOfMonth)
  var timeInMillis = c.timeInMillis
  val millisecondsInADay = 24*60*60*1000L
  timeInMillis += amount * when (timeInterval) {
    TimeInerval.DAY -> millisecondsInADay
    TimeInterval.WEEK -> 7 * millisecondsInADay
    TimeInterval.YEAR -> 0L
  }
  val result = Calendar.getInstance()
  result.timeInMillis = timeInMillis
  return MyDate(result.get(Calendar.YEAR), result.get(Calendar.MONTH), result.get(Calendar.DATE))
}

import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

// Supported intervals that might be added to dates:
enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = addTimeIntervals(timeInterval,1)

class RepeatedTimeInterval(val timeInterval: TimeInterval, val number: Int)

operator fun TimeInterval.times(number: Int) = RepeatedTimeInterval(this,number)

operator fun MyDate.plus(timeIntervals: RepeatedTimeInterval) = addTimeIntervals(timeIntervals.timerInterval,timeIntervals.number)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}


