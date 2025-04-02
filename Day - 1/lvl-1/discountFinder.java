import java.util.Scanner;

public class discountFinder {
    public static void main(String[] args) {
        // 10 % discount in a total fee
        int studentFee = 125000;
        float discount = studentFee * 0.10f;
        float discountedFee = studentFee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}