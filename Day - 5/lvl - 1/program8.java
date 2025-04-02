import java.util.Scanner;
public class StringOper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] str1 = new String[5];
        System.out.println("Enter array elements: ");
        for (int i=0;i<str1.length;i++){
            System.out.print("Enter " + (i+1) + "> ");
            str1[i] = scanner.nextLine();
        }
        System.out.println("Handle Exception");
        handleException(str1);
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("Generate Exception, As the program crashes ...");
        generateException(str1);
    }

    public static void generateException(String[] str1) {
        System.out.print(str1[9999]);
    }

    public static void handleException(String[] str1) {
        try {
            System.out.print(str1[9999]);
        } catch (ArrayIndexOutOfBoundsException  e) {
            System.out.print("Caught the ArrayIndexOutOfBoundsException , " + e.getMessage());
        } 
    }
}
