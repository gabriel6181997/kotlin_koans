// Filter; map
// Learn about mapping and filtering a collection.
// Implement the following extension functions using the map and filter functions:
// Find all the different cities the customers are from
// Find the customers living in a given city
val numbers = listOf(1, -1, 2)
numbers.filter { it > 0 } == listOf(1, 2)
numbers.map { it * it } == listOf(1, 1, 4)

// Find all the different cities the customers are from
fun Shop.getCustomerCities(): Set<City> =
        customers.map{it.city}.toSet()

// Find the customers living in a given city
fun Shop.getCustomersFrom(city: City): List<Customer> =
        customers.filter{it.city == city}
