// All, Any, and other predicates
// Learn about testing predicates and retrieving elements by condition.
// Implement the following functions using all, any, count, find:
// ・checkAllCustomersAreFrom should return true if all customers are from a given city
// ・hasCustomerFrom should check if there is at least one customer from a given city
// ・countCustomersFrom should return the number of customers from a given city
// ・findCustomerFrom should return a customer who lives in a given city, or null if there is none

fun Shop.checkAllCustomersAreFrom(city: City): Boolean =
        customers.all{it.city == city}

// Return true if there is at least one customer from a given city
fun Shop.hasCustomerFrom(city: City): Boolean =
        customers.any{it.city == city}

// Return the number of customers from a given city
fun Shop.countCustomersFrom(city: City): Int =
        customers.count{it.city == city}

// Return a customer who lives in a given city, or null if there is none
fun Shop.findCustomerFrom(city: City): Customer? =
        customers.find {it.city == city}
