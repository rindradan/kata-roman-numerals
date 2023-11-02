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

    fun convert(number: Int): String? =
        when {
            number.isException() -> exceptions[number]
            else -> number.transformDecimals() + number.transformUnits()
        }

    private fun Int.transformDecimals() : String =
        when {
            (this - 50) >= 0 -> L + (this - 50).transformDecimals()
            (this - 10) >= 0 -> X + (this - 10).transformDecimals()
            (this -  5) >= 0 -> V + (this -  5).transformDecimals()
            else -> EMPTY
        }

    private fun Int.transformUnits() = I.repeat(this % 5)

    private fun Int.isException() : Boolean = exceptions.containsKey(this)
}
