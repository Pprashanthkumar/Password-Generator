public class Password {
    private String value;

    public Password(String value) {
        this.value = value;
    }

    private int getCharType(char c) {
        if (Character.isUpperCase(c)) return 1;
        if (Character.isLowerCase(c)) return 2;
        if (Character.isDigit(c)) return 3;
        return 4;
    }

    public int getPasswordStrength() {
        boolean usedUpper = false, usedLower = false, usedNum = false, usedSym = false;

        for (char c : value.toCharArray()) {
            int type = getCharType(c);
            if (type == 1) usedUpper = true;
            if (type == 2) usedLower = true;
            if (type == 3) usedNum = true;
            if (type == 4) usedSym = true;
        }

        int score = 0;
        if (usedUpper) score++;
        if (usedLower) score++;
        if (usedNum) score++;
        if (usedSym) score++;
        if (value.length() >= 8) score++;
        if (value.length() >= 16) score++;

        return score;
    }

    public String calculateScore() {
        int score = getPasswordStrength();
        if (score == 6) return "This is a very strong password!";
        if (score >= 4) return "This is a good password.";
        if (score >= 3) return "This is a medium password.";
        return "This is a weak password.";
    }

    @Override
    public String toString() {
        return value;
    }
}
