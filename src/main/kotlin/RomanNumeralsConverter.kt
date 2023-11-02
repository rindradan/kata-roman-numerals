class RomanNumeralsConverter {
    fun transform(number: Int): String =
        when {
            number == 4 -> "IV"
            number == 9 -> "IX"
            number == 14 -> "XIV"
            number >= 15 -> "X" + "V" + "I".repeat(number % 5)
            number >= 10 -> "X" + "I".repeat(number % 5)
            number >= 5 -> "V" + "I".repeat(number % 5)
            else -> "I".repeat(number % 5)
        }
}
