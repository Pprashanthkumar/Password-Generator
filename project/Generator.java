import java.util.Scanner;

public class Generator {
    private Alphabet alphabet;
    private static Scanner scanner;

    public Generator(Scanner scanner) {
        Generator.scanner = scanner;
    }

    public Generator(boolean includeUpper, boolean includeLower, boolean includeNum, boolean includeSym) {
        alphabet = new Alphabet(includeUpper, includeLower, includeNum, includeSym);
    }

    public void start() {
        System.out.println("Welcome to the Password Generator!");

        while (true) {
            showMenu();
            String choice = scanner.next();

            switch (choice) {
                case "1":
                    generatePassword();
                    break;
                case "2":
                    checkPassword();
                    break;
                case "3":
                    showInfo();
                    break;
                case "4":
                    System.out.println("Exiting. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void showMenu() {
        System.out.println("\nMenu:");
        System.out.println("1 - Generate Password");
        System.out.println("2 - Check Password Strength");
        System.out.println("3 - Show Useful Information");
        System.out.println("4 - Exit");
        System.out.print("Enter your choice: ");
    }

    private void generatePassword() {
        System.out.println("Do you want to include uppercase letters? (yes/no)");
        boolean includeUpper = scanner.next().equalsIgnoreCase("yes");

        System.out.println("Do you want to include lowercase letters? (yes/no)");
        boolean includeLower = scanner.next().equalsIgnoreCase("yes");

        System.out.println("Do you want to include numbers? (yes/no)");
        boolean includeNum = scanner.next().equalsIgnoreCase("yes");

        System.out.println("Do you want to include symbols? (yes/no)");
        boolean includeSym = scanner.next().equalsIgnoreCase("yes");

        if (!includeUpper && !includeLower && !includeNum && !includeSym) {
            System.out.println("You must include at least one character type.");
            return;
        }

        System.out.print("Enter the password length: ");
        int length = scanner.nextInt();

        Generator generator = new Generator(includeUpper, includeLower, includeNum, includeSym);
        Password password = generator.generateRandomPassword(length);

        System.out.println("Generated password: " + password);
    }

    private Password generateRandomPassword(int length) {
        StringBuilder password = new StringBuilder();
        String alphabetStr = alphabet.getAlphabet();

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * alphabetStr.length());
            password.append(alphabetStr.charAt(index));
        }

        return new Password(password.toString());
    }

    private void checkPassword() {
        System.out.print("Enter your password: ");
        String input = scanner.next();

        Password password = new Password(input);
        System.out.println(password.calculateScore());
    }

    private void showInfo() {
        System.out.println("\nUseful Information:");
        System.out.println("1. Use at least 8 characters.");
        System.out.println("2. Include uppercase and lowercase letters, numbers, and symbols.");
        System.out.println("3. Avoid common words and personal information.");
    }
}
