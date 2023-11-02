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
            else -> number.convertDecimals() + number.convertUnits()
        }

    private fun Int.convertDecimals() : String =
        when {
            (this - 50) >= 0 -> L + (this - 50).convertDecimals()
            (this - 10) >= 0 -> X + (this - 10).convertDecimals()
            (this -  5) >= 0 -> V + (this -  5).convertDecimals()
            else -> EMPTY
        }

    private fun Int.convertUnits() = I.repeat(this % 5)

    private fun Int.isException() : Boolean = exceptions.containsKey(this)
}
