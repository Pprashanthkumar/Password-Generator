import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GeneratorTest {
    private final Password password = new Password("Secret");
    private final Alphabet firstAlphabet = new Alphabet(true, false, false, false);
    private final Alphabet secondAlphabet = new Alphabet(false, true, true, true);
    private final Generator generator = new Generator(true, false, false, false);

    @Test
    void testPassword() {
        assertEquals("Secret", password.toString());
    }

    @Test
    void testFirstAlphabet() {
        assertEquals(firstAlphabet.getAlphabet(), Alphabet.UPPERCASE_LETTERS);
    }

    @Test
    void testSecondAlphabet() {
        assertEquals(secondAlphabet.getAlphabet(), Alphabet.LOWERCASE_LETTERS + Alphabet.NUMBERS + Alphabet.SYMBOLS);
    }

    @Test
    void testGeneratorAlphabet() {
        assertEquals(generator.alphabet.getAlphabet(), Alphabet.UPPERCASE_LETTERS);
    }

    @Test
    void testGeneratorAlphabetLength() {
        assertEquals(generator.alphabet.getAlphabet().length(), 26);
    }
}
