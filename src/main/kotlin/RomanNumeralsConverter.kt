class RomanNumeralsConverter {

    private val exceptions = mapOf(
        4 to "IV",
        9 to "IX",
        14 to "XIV",
    )

    fun transform(number: Int): String? =
        when {
            isException(number) -> exceptions[number]
            else -> number.transformDecimals() + number.transformUnits()
        }

    private fun Int.transformDecimals() : String =
        if ((this - 10) >= 0) "X" + (this - 10).transformDecimals()
        else if ((this - 5) >= 0) "V" + (this - 5).transformDecimals()
        else ""

    private fun Int.transformUnits() = "I".repeat(this % 5)

    private fun isException(number: Int) : Boolean = exceptions.containsKey(number)
}
