import RomanNumeral.*

class RomanNumeralsConverter {

    private companion object {
        const val EMPTY = ""
    }

    private val sortedNumberRepresentations = listOf(
        NumberRepresentation(1000, M),
        NumberRepresentation(500, D),
        NumberRepresentation(100, C),
        NumberRepresentation(90, XC),
        NumberRepresentation(50, L),
        NumberRepresentation(40, XL),
        NumberRepresentation(10, X),
        NumberRepresentation(9, IX),
        NumberRepresentation(5, V),
        NumberRepresentation(4, IV),
        NumberRepresentation(1, I),
    )

    fun convert(number: Int): String {
        val numberRepresentation = sortedNumberRepresentations.firstOrNull { number >= it.arabicValue }
        return numberRepresentation?.let { it.romanValue.name + convert(number - it.arabicValue) } ?: EMPTY
    }
}

fun main() {
    val romanNumeralsConverter = RomanNumeralsConverter()
    println(romanNumeralsConverter.convert(99))
}
