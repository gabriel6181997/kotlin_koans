// Partition
// Learn about partitioning and the destructuring declaration syntax that is often used together with partition.
// Then implement a function for returning customers who have more undelivered orders than delivered orders using partition.

val numbers = listOf(1, 3, -4, 2, -11)
val (positive, negative) =
    numbers.partition { it > 0 }

positive == listOf(1, 3, 2)
negative == listOf(-4, -11)

// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> = customers.filter {
  val (delivered, undelivered) = it.orders.partition {it.isDelivered}
  undelivered.size > delivered.size
}.toSet()
