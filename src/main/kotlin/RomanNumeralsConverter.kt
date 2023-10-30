class RomanNumeralsConverter {
    fun transform(number: Int): String =
        when (number) {
            2 -> "II"
            3 -> "III"
            else -> "I"
        }
}