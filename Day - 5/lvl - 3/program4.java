import java.util.Scanner;

public class UniqueCharacters {
    public static int[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256];
        int length = getTextLength(text);

        for (int i = 0; i < length; i++) {
            frequency[text.charAt(i)]++;
        }

        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                count++;
            }
        }

        int[][] result = new int[count][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = i;
                result[index][1] = frequency[i];
                index++;
            }
        }
        return result;
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
        int[][] frequencyData = findCharacterFrequency(input);
        
        System.out.println("Character | Frequency");
        for (int[] entry : frequencyData) {
            System.out.println((char) entry[0] + "         | " + entry[1]);
        }
        scanner.close();
    }
}