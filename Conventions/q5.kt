// Q5 Invoke
// Objects with the invoke() method can be invoked as a function.
// You can add an invoke extension for any class, but it's better not to overuse it:
operator fun Int.invoke() { println(this) }

1() //huh?..

// Implement the function Invokable.invoke() to count the number of times it is invoked.

class Invokable {
  var numberOfInvocations: Int = 0
      private set

  operator fun invoke(): Invokable {
      numberOfInvocations++
      return this
  }
}

fun invokeTwice(invokable: Invokable) = invokable()()
