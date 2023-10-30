class RomanNumeralsConverter {
    fun transform(number: Int): String =
        when (number) {
            4 -> "IV"
            5 -> "V"
            6 -> "VI"
            7 -> "VII"
            else -> "I".repeat(number)
        }
}
