// String and map builders
// Function literals with receiver are very useful for creating builders, for example:
fun buildString(build: StringBuilder.() -> Unit): String {
  val stringBuilder = StringBuilder()
  stringBuilder.build()
  return stringBuilder.toString()
}

val s = buildString {
  this.append("Numbers: ")
  for (i in 1..3) {
      // 'this' can be omitted
      append(i)
  }
}

s == "Numbers: 123"

// Implement the function buildMutableMap that takes a parameter (of extension function type), creates a new HashMap, builds it, and returns it as a result. Note that starting from 1.3.70, the standard library has a similiar buildMap function.

import java.util.HashMap

fun <K, V> buildMutableMap(build: HashMap<K,V>.() -> Unit): Map<K,V> {
    val map = HashMap<K,V>()
    map.build()
    return map
}

fun usage(): Map<Int, String> {
    return buildMutableMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}
