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
        int start = 9;
        int end = 2;
        String newSubString = str1.substring(start, end);
    }

    public static void handleException(String str1) {
        try {
            int start = 9;
            int end = 2;
            if (start > end){
                throw new IllegalArgumentException("IllegalArgumentException");
            }
            String newSubString = str1.substring(start, end);
        } catch (IllegalArgumentException e) {
            System.out.print("Caught the IllegalArgumentException , " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.print("Caught the StringIndexOutOfBoundsException , " + e.getMessage());
        }
    }
}
