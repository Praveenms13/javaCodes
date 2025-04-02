import java.util.Scanner;

public class sideOfTheSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Perimeter of the square: ");
        double perimeter = scanner.nextDouble();
        double lengthOfTheSide = perimeter / 4;
        System.out.println("The length of the side is "+ lengthOfTheSide +" whose perimeter is " + perimeter);
        scanner.close();
    }
}
