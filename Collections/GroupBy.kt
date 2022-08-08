// Group By
// Learn about grouping. Use groupBy to implement the function to build a map that stores the customers living in a given city.

val result =
    listOf("a", "b", "ba", "ccc", "ad")
        .groupBy { it.length }

result == mapOf(
    1 to listOf("a", "b"),
    2 to listOf("ba", "ad"),
    3 to listOf("ccc"))


fun Shop.groupCustomersByCity(): Map<City, List<Customer>> =
    customers.groupBy {it.city}
