class RomanNumeralsConverter {
    fun transform(number: Int): String = if (number == 4) "IV" else "I".repeat(number)
}