// Sort
// Learn about collection ordering and the the difference between operations in-place on mutable collections and operations returning new collections.
// Implement a function for returning the list of customers, sorted in descending order by the number of orders they have made. Use sortedDescending or sortedByDescending.

fun Shop.getCustomersSortedByOrders(): List<Customer> =
    customers.sortedByDescending{it.orders.size}
