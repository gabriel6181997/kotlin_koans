// Builders: how they work
// Answer the questions below

// 1. In the Kotlin code
tr {
  td {
      text("Product")
  }
  td {
      text("Popularity")
  }
}
// td is:
// a. a special built-in syntactic construct
// b. a function declaration
// c. a function invocation
// The correect answer is c.

// 2. In the Kotlin code
tr (color = "yellow") {
  td {
      text("Product")
  }
  td {
      text("Popularity")
  }
}
// color is:
// a. a new variable declaration
// b. an argument name
// c. an argument value
// The correct answer is b.

// 3. The block
{
  text("Product")
}
// from the previous question is:
// a. a block inside built-in syntax construction td
// b. a function literal (or "lambda")
// c. something mysterious
// The correct answer is b.

// 4. For the code
tr (color = "yellow") {
  this.td {
      text("Product")
  }
  td {
      text("Popularity")
  }
}
// which of the following is true:
// a. this code doesn't compile
// b. this refers to an instance of an outer class
// c. this refers to a receiver parameter TR of the function literal:
tr (color = "yellow") {
  this@tr.td {
      text("Product")
  }
}
// The correct answer is c.
