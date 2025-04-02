import java.util.Scanner;

public class VowelConsonantChecker {
    public static String checkCharacterType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }
    
    public static String[][] categorizeCharacters(String str) {
        String[][] result = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            result[i][0] = String.valueOf(currentChar);
            result[i][1] = checkCharacterType(currentChar);
        }
        return result;
    }
    
    public static void displayCharacterTypes(String[][] data) {
        System.out.println("Character | Type");
        System.out.println("----------------");
        for (String[] entry : data) {
            System.out.printf("   %s      | %s%n", entry[0], entry[1]);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String[][] categorizedData = categorizeCharacters(input);
        displayCharacterTypes(categorizedData);
        
        scanner.close();
    }
}