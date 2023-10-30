class RomanNumeralsConverter {
    fun transform(number: Int): String =
        when (number) {
            5 -> "V"
            4 -> "IV"
            else -> "I".repeat(number)
        }
}
