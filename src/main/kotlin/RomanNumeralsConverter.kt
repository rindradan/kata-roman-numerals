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

    private fun Int.transformDecimals() : String = when {
        this >= 15 -> "X" + "V"
        this >= 10 -> "X"
        this >= 5 -> "V"
        else -> ""
    }

    private fun Int.transformUnits() = "I".repeat(this % 5)

    private fun isException(number: Int) : Boolean = exceptions.containsKey(number)
}
