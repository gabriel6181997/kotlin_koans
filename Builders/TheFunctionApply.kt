// The function apply
// The previous examples can be rewritten using the library function apply. Write your implementation of this function named myApply.
// Learn about the other scope functions and how to use them.

fun <T> T.myApply(f: T.() -> Unit): T {
  f()
    return this
}

fun createString(): String {
  return StringBuilder().myApply {
      append("Numbers: ")
      for (i in 1..10) {
          append(i)
      }
  }.toString()
}

fun createMap(): Map<Int, String> {
  return hashMapOf<Int, String>().myApply {
      put(0, "0")
      for (i in 1..10) {
          put(i, "$i")
      }
  }
}
