// Sequences
// Learn about sequences, they allow you to perform operations lazily rather than eagerly.
// Copy the implementation from the previous task and modify it in a way that the operations on sequences are used.

// Find the most expensive product among all the delivered products
// ordered by the customer. Use `Order.isDelivered` flag.
fun findMostExpensiveProductBy(customer: Customer): Product? {
  val deliveredProduct = customer.orders.asSequence().filter{it.isDelivered}
  return deliveredProduct.flatMap(Order::products).maxWithOrNull(compareBy {it.price})
}

// Count the amount of times a product was ordered.
// Note that a customer may order the same product several times.
fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
   return customers.asSequence().flatMap(Customer::getOrderedProducts).count {it == product}
}

fun Customer.getOrderedProducts(): Sequence<Product> =
        orders.asSequence().flatMap(Order::products)
