class RomanNumeralsConverter {
    fun transform(number: Int): String =
        when (number) {
            4 -> "IV"
            5 -> "V"
            6 -> "VI"
            else -> "I".repeat(number)
        }
}
