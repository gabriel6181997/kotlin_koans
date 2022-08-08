// Introduction
// This section was inspired by GS Collections Kata.
// Kotlin can be easily mixed with Java code. Default collections in Kotlin are all Java collections under the hood. Learn about read-only and mutable views on Java collections.
// The Kotlin standard library contains lots of extension functions that make working with collections more convenient. For example, operations that transform a collection into another one, starting with 'to': toSet or toList.
// Implement the extension function Shop.getSetOfCustomers(). The class Shop and all related classes can be found in Shop.kt.

fun Shop.getSetOfCustomers(): Set<Customer> =
    customers.toSet()
