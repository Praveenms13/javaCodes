import java.util.Scanner;

public class StringOper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Str1: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        StringOper stringOperObj = new StringOper();
        String subString = str1.substring(start, end);
        System.out.println("Using Function: " + subString);
        System.out.println("Custom Sub String: " + stringOperObj.createSubString(str1, start, end));
        System.out.println("Is same ? " + stringOperObj.compareString(subString,stringOperObj.createSubString(str1, start, end)));
        scanner.close();
    }

    public String createSubString(String str1, int start, int end){
        String subString = "";
        for (int i=start;i<end;i++){
            subString += str1.charAt(i); 
        }
        return subString;
    }

    public boolean compareString(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }

        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) != string2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
