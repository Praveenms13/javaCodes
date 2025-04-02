import java.util.Scanner;
public class StringOper {
    public static void main(String[] args) {
        // generateException();
        handleException();
    }

    public static void generateException() {
        String str1 = null;
        int length = str1.length();
    }

    public static void handleException() {
        try {
            String str1 = null;
            int length = str1.length();
        } catch (NullPointerException e) {
            System.out.print("Caught the NullPointerException, " + e.getMessage());
        }
    }
}
