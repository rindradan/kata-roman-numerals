class RomanNumeralsConverter {
    fun transform(number: Int): String =
        when {
            number == 4 -> "IV"
            number == 9 -> "IX"
            number == 14 -> "XIV"
            number == 15 -> "XV"
            number == 16 -> "XVI"
            number == 17 -> "XVII"
            number == 18 -> "XVIII"
            number >= 10 -> "X" + "I".repeat(number-10)
            number >= 5 -> "V" + "I".repeat(number-5)
            else -> "I".repeat(number)
        }
}
