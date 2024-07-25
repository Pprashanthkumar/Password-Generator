public class Alphabet {
    public static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    public static final String NUMBERS = "1234567890";
    public static final String SYMBOLS = "!@#$%^&*()-_=+\\/~?";

    private final StringBuilder pool;

    public Alphabet(boolean includeUppercase, boolean includeLowercase, boolean includeNumbers, boolean includeSymbols) {
        pool = new StringBuilder();

        if (includeUppercase) pool.append(UPPERCASE_LETTERS);
        if (includeLowercase) pool.append(LOWERCASE_LETTERS);
        if (includeNumbers) pool.append(NUMBERS);
        if (includeSymbols) pool.append(SYMBOLS);
    }

    public String getAlphabet() {
        return pool.toString();
    }
}
