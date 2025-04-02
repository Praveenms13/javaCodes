import java.util.Scanner;

public class discountFinderUserInput {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter the student fee: ");
        int studentFee = Scanner.nextInt();
        System.out.print("Enter the discount percent: ");
        int discountPercent = Scanner.nextInt();
        float discount = studentFee * discountPercent / 100;
        float discountedFee = studentFee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}