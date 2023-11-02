internal data class NumberRepresentation(
    val arabicValue: Int,
    val romanValue: RomanNumeral,
)

internal enum class RomanNumeral {
    I, IV, V, IX, X, XL, L, C, D, M,
}
