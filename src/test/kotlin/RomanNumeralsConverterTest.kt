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

    @Test
    fun `should convert 7 to VII`() {
        val romanNumeralsConverter = RomanNumeralsConverter()
        romanNumeralsConverter.transform(7) shouldBe "VII"
    }

    @Test
    fun `should convert 8 to VIII`() {
        val romanNumeralsConverter = RomanNumeralsConverter()
        romanNumeralsConverter.transform(8) shouldBe "VIII"
    }

    @Test
    fun `should convert 9 to IX`() {
        val romanNumeralsConverter = RomanNumeralsConverter()
        romanNumeralsConverter.transform(9) shouldBe "IX"
    }

    @Test
    fun `should convert 10 to X`() {
        val romanNumeralsConverter = RomanNumeralsConverter()
        romanNumeralsConverter.transform(10) shouldBe "X"
    }

    @Test
    fun `should convert 11 to XI`() {
        val romanNumeralsConverter = RomanNumeralsConverter()
        romanNumeralsConverter.transform(11) shouldBe "XI"
    }

    @Test
    fun `should convert 12 to XII`() {
        val romanNumeralsConverter = RomanNumeralsConverter()
        romanNumeralsConverter.transform(12) shouldBe "XII"
    }

    @Test
    fun `should convert 13 to XIII`() {
        val romanNumeralsConverter = RomanNumeralsConverter()
        romanNumeralsConverter.transform(13) shouldBe "XIII"
    }

    @Test
    fun `should convert 14 to XIV`() {
        val romanNumeralsConverter = RomanNumeralsConverter()
        romanNumeralsConverter.transform(14) shouldBe "XIV"
    }

    @Test
    fun `should convert 15 to XV`() {
        val romanNumeralsConverter = RomanNumeralsConverter()
        romanNumeralsConverter.transform(15) shouldBe "XV"
    }

    @Test
    fun `should convert 16 to XVI`() {
        val romanNumeralsConverter = RomanNumeralsConverter()
        romanNumeralsConverter.transform(16) shouldBe "XVI"
    }

    @Test
    fun `should convert 17 to XVII`() {
        val romanNumeralsConverter = RomanNumeralsConverter()
        romanNumeralsConverter.transform(17) shouldBe "XVII"
    }

    @Test
    fun `should convert 18 to XVIII`() {
        val romanNumeralsConverter = RomanNumeralsConverter()
        romanNumeralsConverter.transform(18) shouldBe "XVIII"
    }

    @Test
    fun `should convert 19 to XIX`() {
        val romanNumeralsConverter = RomanNumeralsConverter()
        romanNumeralsConverter.transform(19) shouldBe "XIX"
    }

    @Test
    fun `should convert 20 to XX`() {
        val romanNumeralsConverter = RomanNumeralsConverter()
        romanNumeralsConverter.transform(20) shouldBe "XX"
    }

    @Test
    fun `should convert 50 to L`() {
        val romanNumeralsConverter = RomanNumeralsConverter()
        romanNumeralsConverter.transform(50) shouldBe "L"
    }
}
