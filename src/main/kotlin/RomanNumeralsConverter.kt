class RomanNumeralsConverter {

    private companion object {
        const val I = "I"
        const val V = "V"
        const val X = "X"
        const val L = "L"
        const val EMPTY = ""
    }

    private val exceptions = mapOf(
        4 to "IV",
        9 to "IX",
        14 to "XIV",
        19 to "XIX",
    )

    fun convert(number: Int): String? =
        when {
            number.isException() -> exceptions[number]
            else -> number.convert()
        }

    private fun Int.convert() : String =
        when {
            (this - 50) >= 0 -> L + (this - 50).convert()
            (this - 10) >= 0 -> X + (this - 10).convert()
            (this -  5) >= 0 -> V + (this -  5).convert()
            (this -  1) >= 0 -> I + (this -  1).convert()
            else -> EMPTY
        }

    private fun Int.isException() : Boolean = exceptions.containsKey(this)
}
