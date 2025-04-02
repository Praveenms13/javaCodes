import java.util.Scanner;

public class discountFinderUserInput {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter your height in centimeters: ");
        float height = Scanner.nextFloat();
        float feet = height / 30.48f;
        float inches = height / 2.54f;
        System.out.println("The height in cm is " + height + " while in feet is " + feet + " and inches is " + inches);
    }
}