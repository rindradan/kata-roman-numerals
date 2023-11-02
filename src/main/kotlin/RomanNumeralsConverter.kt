import RomanNumeral.*

class RomanNumeralsConverter {

    private companion object {
        const val EMPTY = ""
    }

    private val exceptions = mapOf(
        9 to "IX",
        19 to "XIX",
    )

    private val sortedNumberRepresentations = listOf(
        NumberRepresentation(1000, M),
        NumberRepresentation(500, D),
        NumberRepresentation(100, C),
        NumberRepresentation(50, L),
        NumberRepresentation(10, X),
        NumberRepresentation(5, V),
        NumberRepresentation(4, IV),
        NumberRepresentation(1, I),
    )

    fun convert(number: Int): String? =
        when {
            number.isException() -> exceptions[number]
            else -> number.toRomanNumeral()
        }

    private fun Int.toRomanNumeral() : String {
        val numberRepresentation = sortedNumberRepresentations.firstOrNull { this >= it.arabicValue }
        return numberRepresentation?.let { it.romanValue.name + (this - it.arabicValue).toRomanNumeral() } ?: EMPTY
    }

    private fun Int.isException() : Boolean = exceptions.containsKey(this)
}
