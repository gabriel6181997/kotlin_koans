// FlatMap
// Learn about flattening and implement two functions using flatMap:
// ・The first should return all products the given customer has ordered
// ・The second should return all products that at least one customer ordered

val result = listOf("abc", "12")
    .flatMap { it.toList() }

result == listOf('a', 'b', 'c', '1', '2')

// Return all products the given customer has ordered
fun Customer.getOrderedProducts(): List<Product> = orders.flatMap(Order::products)

// Return all products that were ordered by at least one customer
fun Shop.getOrderedProducts(): Set<Product> = customers.flatMap(Customer::getOrderedProducts).toSet()
