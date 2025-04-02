import java.util.Scanner;

public class StringOper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Str1: ");
        String str1 = scanner.nextLine();

        StringOper stringOperObj = new StringOper();
        char[] charArray = stringOperObj.returnCharecterArray(str1);
        char[] charArrayWithtoCharArray = str1.toCharArray(); 

        System.out.print("Comparing both the string arrays: " + stringOperObj.compareChar(charArray, charArrayWithtoCharArray));
        scanner.close();
    }

    public char[] returnCharecterArray(String str1) {
        char[] charArray = new char[str1.length()];
        for (int i = 0; i < str1.length(); i++) {
            charArray[i] = str1.charAt(i);
        }
        return charArray;
    }

    public boolean compareChar(char[] a, char[] b) { 
        if (a.length != b.length) { 
            return false;
        }

        for (int i = 0; i < a.length; i++) { 
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }
}
