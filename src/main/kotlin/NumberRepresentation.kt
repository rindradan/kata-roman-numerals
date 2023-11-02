internal data class NumberRepresentation(
    val arabicValue: Int,
    val romanValue: RomanNumeral,
)

internal enum class RomanNumeral {
    I, V, X, L,
}
