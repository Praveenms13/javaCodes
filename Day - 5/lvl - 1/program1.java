import java.util.Scanner;

public class StringOper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Str1: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter Str2: ");
        String str2 = scanner.nextLine();

        StringOper stringOperObj = new StringOper();
        System.out.println("Is both string are same? " + stringOperObj.compareString(str1, str2));
        System.out.println("Is both string are same using the equals() ? " + str1.equals(str2));
        scanner.close();
    }

    public boolean compareString(String str1, String str2) {
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
