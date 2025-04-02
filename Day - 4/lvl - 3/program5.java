import static java.lang.System.out;
import java.util.Scanner;
import java.util.Arrays;
public class NumberChecker  {
    public static void main(String args[]){
        try {
            Scanner scanner = new Scanner(System.in);
            out.print("Enter the number: ");
            int number = scanner.nextInt();
            NumberChecker numberCheckerObj = new NumberChecker();
            out.println("isAutomorphic ? " + numberCheckerObj.isAutomorphic(number));
            out.println("isPrime ? " + numberCheckerObj.isPrime(number));
            out.println("isNeon ? " + numberCheckerObj.isNeon(number));
            out.println("isSpy ? " + numberCheckerObj.isSpy(number));
            out.println("isBuzz ? " + numberCheckerObj.isBuzz(number));
        } catch (Exception e){
            out.println("Error Occured: " + e);
        }
    }

    public boolean isPrime(int num) {
        if (num <= 1){
            return false;
        }
        for (int i=2;i<=Math.sqrt(num);i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
    public boolean isNeon(int num) {
        if (num <= 0){
            return false;
        }
        int originalNumber = num;
        int sum = 0;
        num = num * num;
        while (num != 0){
            sum += num % 10;
            num /= 10;
        }
        return originalNumber == sum;
    }
    public boolean isSpy(int num){
        if (num <= 0){
            return false;
        }
        int product = 1;
        int sum = 0;
        while (num != 0){
            sum += num % 10;
            product *= num % 10;
            num /= 10;
        }
        return product == sum;
    }
    public boolean isAutomorphic(int num) {
        if (num <= 0){
            return false;
        }
        int squareNum = num * num;
        int originalNumber = num;
        int count = 0;
        while (num != 0){
            num /= 10;
            count++;
        }
        int lastDigits = squareNum % (int) Math.pow(10, count);
        return lastDigits == originalNumber;
    }
    public boolean isBuzz(int num) {
        if (num <= 0){
            return false;
        }
        if (num % 7 == 0){
            return true;
        }
        int lastDigit = num % 10;
        if (lastDigit == 7){
            return true;
        }
        return false;
    }
}