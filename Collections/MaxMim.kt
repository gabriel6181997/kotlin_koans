// Max min
// Learn about collection aggregate operations.
// Implement two functions:
// The first should return the customer who has placed the most amount of orders in this shop
// The second should return the most expensive product that the given customer has ordered
// The functions maxOrNull, minOrNull, maxByOrNull, and minByOrNull might be helpful.
listOf(1, 42, 4).maxOrNull() == 42
listOf("a", "ab").minByOrNull(String::length) == "a"
// You can use callable references instead of lambdas. It can be especially helpful in call chains, where it occurs in different lambdas and has different types. Implement the getMostExpensiveProductBy function using callable references.

// Return a customer who has placed the maximum amount of orders
fun Shop.getCustomerWithMaxOrders(): Customer? = customers.maxByOrNull{it.orders.size}

// Return the most expensive product that has been ordered by the given customer
fun getMostExpensiveProductBy(customer: Customer): Product? = customer.orders.flatMap(Order::products).maxByOrNull(Product::price)
