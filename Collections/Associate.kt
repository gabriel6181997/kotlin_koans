// Associate
// Learn about association. Implement the following functions using associateBy, associateWith, and associate:
// ・Build a map from the customer name to the customer
// ・Build a map from the customer to their city
// ・Build a map from the customer name to their city

val list = listOf("abc", "cdef")

list.associateBy { it.first() } ==
        mapOf('a' to "abc", 'c' to "cdef")

list.associateWith { it.length } ==
        mapOf("abc" to 3, "cdef" to 4)

list.associate { it.first() to it.length } ==
        mapOf('a' to 3, 'c' to 4)

// Build a map from the customer name to the customer
fun Shop.nameToCustomerMap(): Map<String, Customer> =
       customers.associateBy {it.name}

// Build a map from the customer to their city
fun Shop.customerToCityMap(): Map<Customer, City> =
       customers.associateWith {it.city}

// Build a map from the customer name to their city
fun Shop.customerNameToCityMap(): Map<String, City> =
       customers.associate{it.name to it.city}
