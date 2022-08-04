// Introduction Q2 Named arguments
// Make the function joinOptions() return the list in a JSON format (for example, [a, b, c]) by specifying only two arguments.
// Default and named arguments help to minimize the number of overloads and improve the readability of the function invocation. The library function joinToString is declared with default values for parameters: (edited)

fun joinOptions(options: Collection<String>) =
    options.joinToString(prefix = "[", postfix = "]")
