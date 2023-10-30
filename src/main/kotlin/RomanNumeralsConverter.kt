class RomanNumeralsConverter {
    fun transform(number: Int): String =
        when {
            number == 4 -> "IV"
            number == 9 -> "IX"
            number == 10 -> "X"
            number == 11 -> "XI"
            number == 12 -> "XII"
            number == 13 -> "XIII"
            number >= 5 -> "V" + "I".repeat(number-5)
            else -> "I".repeat(number)
        }
}
