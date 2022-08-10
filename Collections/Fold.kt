// Fold
// Learn about fold and reduce and implement a function that returns the set of products that all the customers ordered using fold.
// You can use the Customer.getOrderedProducts() defined in the previous task (copy its implementation).
listOf(1, 2, 3, 4)
    .fold(1) { partProduct, element ->
        element * partProduct
    } == 24

// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> {
  val allProducts = customers.flatMap{it.getOrderedProducts()}.toSet()
  return customers.fold(allProducts) {orderedByAll, customer ->
    orderedByAll.intersect(customer.getOrderedProducts())
  }
}

fun Customer.getOrderedProducts(): List<Product> = orders.flatMap(Order::products)
