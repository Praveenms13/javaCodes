import java.util.Scanner;
public class StringOper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String str1;
        System.out.print("Enter the string: ");
        str1 = scanner.nextLine();
        System.out.println("Handle Exception");
        handleException(str1);
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("Generate Exception, As the program crashes ...");
        generateException(str1);
    }

    public static void generateException(String str1) {
        char a = str1.charAt(-5);
    }

    public static void handleException(String str1) {
        try {
            char a = str1.charAt(-5);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.print("Caught the StringIndexOutOfBoundsException, " + e.getMessage());
        }
    }
}
