import RomanNumeral.*

class RomanNumeralsConverter {

    private companion object {
        const val EMPTY = ""
    }

    private val exceptions = mapOf(
        4 to "IV",
        9 to "IX",
        14 to "XIV",
        19 to "XIX",
    )

    private val sortedNumberRepresentations = listOf(
        NumberRepresentation(50, L),
        NumberRepresentation(10, X),
        NumberRepresentation(5, V),
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
