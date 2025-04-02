import java.util.Scanner;

public class StringOper {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the text: ");
        String str1 = scanner.nextLine();
        
        String manuallyConverted = convertStringToUppercase(str1);
        String builtInConverted = str1.toUpperCase();
        
        boolean isEqual = compareStrings(manuallyConverted, builtInConverted);
        
        System.out.println("Manually Converted Uppercase: " + manuallyConverted);
        System.out.println("Built-in Uppercase: " + builtInConverted);
        System.out.println("Are both strings equal? " + isEqual);
    }

    public static String convertStringToUppercase(String str1) {
        StringBuilder result = new StringBuilder(); 
        
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch >= 97 && ch <= 122) {
                result.append((char) (ch - 32));
            } else {
                result.append(ch);
            }
        }
        
        return result.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }
}
