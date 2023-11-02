class RomanNumeralsConverter {

    private companion object {
        const val I = "I"
        const val V = "V"
        const val X = "X"
        const val L = "L"
        const val EMPTY = ""
    }

    private val exceptions = mapOf(
        4 to "IV",
        9 to "IX",
        14 to "XIV",
        19 to "XIX",
    )

    private val sortedRomanNumerals = listOf(
        RomanNumeral(50, L),
        RomanNumeral(10, X),
        RomanNumeral(5, V),
        RomanNumeral(1, I),
    )

    fun convert(number: Int): String? =
        when {
            number.isException() -> exceptions[number]
            else -> number.toRomanNumeral()
        }

    private fun Int.toRomanNumeral() : String {
        val romanNumeral = sortedRomanNumerals.firstOrNull { this - it.arabicValue >= 0 }
        return romanNumeral?.let { it.romanValue + (this - it.arabicValue).toRomanNumeral() } ?: EMPTY
    }

    private fun Int.isException() : Boolean = exceptions.containsKey(this)
}
