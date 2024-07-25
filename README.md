# Password-Generator
A simple password generator and strength checker implemented in Java, featuring user interaction, customizable criteria, and unit tests.
The codebase consists of several classes that together implement a password generation and checking system. This system allows users to generate passwords based on selected criteria (uppercase letters, lowercase letters, numbers, symbols) and to check the strength of existing passwords. It also provides useful information about creating strong passwords.

* Alphabet.java
  Purpose: Defines the character sets (uppercase letters, lowercase letters, numbers, and symbols) used for generating       
    passwords.
  Functionality: Constructs an alphabet based on user-specified criteria by concatenating the relevant character sets.
  
* Password.java
  Purpose: Represents a password and provides methods to evaluate its strength.
  Functionality:
    getCharType(char c): Determines the type of a given character (uppercase, lowercase, digit, symbol).
    getPasswordStrength(): Evaluates the strength of the password based on character diversity and length.
    calculateScore(): Provides a human-readable assessment of the password's strength.
    Overrides toString() to return the password value.
    
* Generator.java
  Purpose: Handles user interactions and password generation logic.
  Functionality:
    Presents a menu to the user.
    Collects user input to determine password criteria.
    Generates a password using the selected criteria.
    Checks the strength of a given password.
    Provides useful information about creating strong passwords.

* Main.java
  Purpose: Serves as the entry point of the application.
  Functionality: Initializes and starts the password generator.
* GeneratorTest.java
  Purpose: Contains unit tests to verify the functionality of the Password, Alphabet, and Generator classes.
  Functionality:
    Tests the correct creation of passwords and alphabets.
    Verifies the length and content of the generated alphabets.

* Conclusion
Overall, the codebase provides a solid foundation for a password generator and strength checker application. It effectively uses object-oriented principles to separate concerns and maintain readability. With some minor improvements and additional features, this tool could become even more robust and user-friendly.
