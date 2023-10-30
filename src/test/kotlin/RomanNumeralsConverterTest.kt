import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class RomanNumeralsConverterTest {
    @Test
    fun `should convert 1 to I`() {
        val romanNumeralsConverter = RomanNumeralsConverter()
        romanNumeralsConverter.transform(1) shouldBe "I"
    }

    @Test
    fun `should convert 2 to II`() {
        val romanNumeralsConverter = RomanNumeralsConverter()
        romanNumeralsConverter.transform(2) shouldBe "II"
    }

    @Test
    fun `should convert 3 to III`() {
        val romanNumeralsConverter = RomanNumeralsConverter()
        romanNumeralsConverter.transform(3) shouldBe "III"
    }

    @Test
    fun `should convert 4 to IV`() {
        val romanNumeralsConverter = RomanNumeralsConverter()
        romanNumeralsConverter.transform(4) shouldBe "IV"
    }

    @Test
    fun `should convert 5 to V`() {
        val romanNumeralsConverter = RomanNumeralsConverter()
        romanNumeralsConverter.transform(5) shouldBe "V"
    }

    @Test
    fun `should convert 6 to VI`() {
        val romanNumeralsConverter = RomanNumeralsConverter()
        romanNumeralsConverter.transform(6) shouldBe "VI"
    }
}
