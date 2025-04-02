import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of students: ");
        int noOfStudents = scanner.nextInt();
        int combination = noOfStudents * (noOfStudents - 1) / 2;
        System.out.println("The maximum number of handshakes possible is " + combination);
        scanner.close();
    }
}
