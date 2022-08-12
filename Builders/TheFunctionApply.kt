// The function apply
// The previous examples can be rewritten using the library function apply. Write your implementation of this function named myApply.
// Learn about the other scope functions and how to use them.

fun <T> T.myApply(f: T.() -> Unit): T {
  f()            // f は引数を一つも取らず、かつ返り値もなし(Unit)な関数オブジェクトなので、f() で関数を実行してあげている
    return this // this = T 型のインスタンス
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
