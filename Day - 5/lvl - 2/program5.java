import java.util.Scanner;

public class StringOper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1 = scanner.nextLine();
        
        int[] result = countVowelsAndConsonants(str1);
        
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
        System.out.println("Invalid characters: " + result[2]);
        
        scanner.close();
    }

    public static int[] countVowelsAndConsonants(String str1) {
        int vowelsCount = 0;
        int consonantsCount = 0;
        int invalidCount = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        
        for (int i = 0; i < str1.length(); i++) {
            char currentChar = str1.charAt(i);

            if (Character.isUpperCase(currentChar)) {
                currentChar = Character.toLowerCase(currentChar);
            }
            
            if (currentChar >= 'a' && currentChar <= 'z') {
                boolean isVowel = false;
                for (char v : vowels) {
                    if (v == currentChar) {
                        vowelsCount++;
                        isVowel = true;
                        break;
                    }
                }
                if (!isVowel) {
                    consonantsCount++;
                }
            } else {
                invalidCount++;
            }
        }
        
        return new int[] {vowelsCount, consonantsCount, invalidCount};
    }
}
