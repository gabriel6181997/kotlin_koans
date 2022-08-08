// Sum
// Implement a function that calculates the total amount of money the customer has spent: the sum of the prices for all the products ordered by a given customer. Note that each product should be counted as many times as it was ordered.
// Use sum on a collection of numbers or sumOf to convert the elements to numbers first and then sum them up.
listOf(1, 5, 3).sum() == 9
listOf("a", "b", "cc").sumOf { it.length } == 4

// Return the sum of prices for all the products ordered by a given customer
fun moneySpentBy(customer: Customer): Double = customer.orders.flatMap{it.products}.sumOf{it.price}
