import java.util.Scanner;
import java.util.Random;

public class Generator {
    private Characters characters = new Characters();
    public void generate() {
        printMenu();
        try (Scanner sc = new Scanner(System.in)) {
            int enteredChoice = sc.nextInt();
            switch (enteredChoice) {
                case 1: // generate new password
                    generatePassword();
                    generate();
                    break;
                case 2: // quit
                    printQuitMessage();
                    break;
                default:
                    incorrectOption();
                    generate();
                    break;
            }
        }
    }

    private void generatePassword() {
        final StringBuilder result = new StringBuilder("");
        String charactersString = characters.getCharacters();
        for (int i = 0; i < 16; i++) {
            char c = getRandomChar(charactersString); // get random character from all possible characters
            result.append(c);
        }
        System.out.println("Your password is: " + result.toString());
    }

    private static char getRandomChar(String inputString) {
        // Check if the input string is not empty
        if (inputString == null || inputString.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be empty or null");
        }

        // Use Random class to generate a random index within the length of the string
        Random random = new Random();
        int randomIndex = random.nextInt(inputString.length());

        // Return the random character at the generated index
        return inputString.charAt(randomIndex);
    }

    public void printMenu() {
        System.out.println("Welcome to password generator!");
        System.out.println("Press 1 to generate a new password.");
        System.out.println("Press 2 to exit.");
    }

    private void printQuitMessage() {
        System.out.println("Closing the program!");
    }

    private void incorrectOption() {
        System.out.println("Please enter a valid option.");
    }
}
