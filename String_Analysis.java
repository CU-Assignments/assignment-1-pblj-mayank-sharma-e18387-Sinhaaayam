import java.util.Scanner;

public class StringAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for a string input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Variables to store the counts
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int specialChars = 0;
        
        // Convert the input to lowercase to handle case-insensitive checks
        input = input.toLowerCase();
        
        // Iterate through the string and analyze each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            // Check if the character is a consonant
            else if ((ch >= 'a' && ch <= 'z')) {
                consonants++;
            }
            // Check if the character is a digit
            else if (ch >= '0' && ch <= '9') {
                digits++;
            }
            // Otherwise, it's a special character
            else if (!Character.isWhitespace(ch)) {
                specialChars++;
            }
        }
        
        // Output the results
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialChars);
        
        scanner.close();
    }
}
