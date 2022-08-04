// Q4: Triple-quoted strings
// Learn about the different string literals and string templates in Kotlin.
// You can use the handy library functions trimIndent and trimMargin to format multiline triple-quoted strings in accordance with the surrounding code.
// Replace the trimIndent call with the trimMargin call taking # as the prefix value so that the resulting string doesn't contain the prefix character.

const val question = "life, the universe, and everything"
const val answer = 42

val tripleQuotedString = """
    #question = "$question"
    #answer = $answer""".trimMargin("#")

fun main() {
    println(tripleQuotedString)
}
