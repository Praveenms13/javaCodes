import java.util.Scanner;

public class program11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principle Amount: ");
        int principle = scanner.nextInt();
        System.out.print("Enter Rate: ");
        int rate = scanner.nextInt();
        System.out.print("Enter Time in years: ");
        int time = scanner.nextInt();
        int simpleInterest = (principle * rate * time) / 100;
        System.out.println("The Simple Interest is " + simpleInterest + " for Principle " + principle + ", Rate is " + rate + " and Time is " + time);
        scanner.close();
    }
}
