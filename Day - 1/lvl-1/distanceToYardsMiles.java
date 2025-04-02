import java.util.Scanner;

public class distanceToYardsMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        float feet = scanner.nextFloat();
        float miles = feet / 5280;
        float yards = feet / 3;
        System.out.println("The Distance " + feet + " feet in Yards is: " + yards + " yards and in Miles is: " + miles + " miles");
        scanner.close();
    }
}
