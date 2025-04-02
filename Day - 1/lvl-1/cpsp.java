import java.util.Scanner;

public class cpsp {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;
        int profitVal = sellingPrice - costPrice;
        double profitPercentage = ((double) profitVal / costPrice) * 100;
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\nThe Profit is INR " + profitVal + " and the Profit Percentage is " + profitPercentage);
    }
}