import java.util.Scanner;

public class StringOper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Str1: ");
        String str1 = scanner.nextLine();
        System.out.println("Custom Function to calculate length: " + findLengthOftheString(str1));
        System.out.println("Built In Function to calculate length: " + str1.length());
        scanner.close();
    }

    public static int findLengthOftheString(String str1) {
        int count = 0;
        try {
            while (true) {
                char a = str1.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }
}
