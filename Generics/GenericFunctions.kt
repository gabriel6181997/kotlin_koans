// Generic functions
// Learn about generic functions. Make the code compile by implementing a partitionTo function that splits a collection into two collections according to the predicate.
// There is a partition() function in the standard library that always returns two newly created lists. Write a function that splits the collection into two collections given as arguments. The signature of the toCollection() function from the standard library might help you.

import java.util.*

fun<T, C: MutableCollection<T>>.partitionTo(first: C, second: C, predicate: (T) -> Boolean): Pair<C, C> {
    for (element in this) {
        if (predicate(element)) {
            first.add(element)
        } else {
            second.add(element)
        }
    }
    return Pair(first, second)
}

// References for the above code:
// https://qiita.com/SYABU555/items/c6d828b4c29c545a58f3

fun partitionWordsAndLines() {
    val (words, lines) = listOf("a", "a b", "c", "d e")
            .partitionTo(ArrayList(), ArrayList()) { s -> !s.contains(" ") }
    check(words == listOf("a", "c"))
    check(lines == listOf("a b", "d e"))
}

fun partitionLettersAndOtherSymbols() {
    val (letters, other) = setOf('a', '%', 'r', '}')
            .partitionTo(HashSet(), HashSet()) { c -> c in 'a'..'z' || c in 'A'..'Z' }
    check(letters == setOf('a', 'r'))
    check(other == setOf('%', '}'))
}
