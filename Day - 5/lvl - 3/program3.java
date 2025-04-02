import java.util.Scanner;

public class UniqueCharacters {
    public static char findFirstNonRepeatingCharacter(String text) {
        int[] frequency = new int[256];
        int length = getTextLength(text);

        for (int i = 0; i < length; i++) {
            frequency[text.charAt(i)]++;
        }

        for (int i = 0; i < length; i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '_';
    }

    public static int getTextLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        char firstNonRepeating = findFirstNonRepeatingCharacter(input);
        
        if (firstNonRepeating != '_') {
            System.out.println("First non-repeating character: " + firstNonRepeating);
        } else {
            System.out.println("No unique character found.");
        }
        scanner.close();
    }
}
