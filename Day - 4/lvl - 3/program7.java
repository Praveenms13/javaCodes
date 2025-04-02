import static java.lang.System.out;
import java.util.Scanner;
import java.util.Arrays;
public class NumberChecker  {
    public static void main(String args[]){
        try {
            Scanner scanner = new Scanner(System.in);
            int[] otpArray = new int[10];
            NumberChecker numberCheckerObj = new NumberChecker();
            for (int i=0;i<10;i++){
                otpArray[i] = numberCheckerObj.generateOTP(); 
            }
            for (int i=0;i<10;i++){
                if (! numberCheckerObj.isUnique(otpArray[i], otpArray, i)){
                    out.println("Duplicates OTP Found: " + otpArray[i]);
                    System.exit(0);
                }
            }
            out.println("Looks like all the otp are unique.");
        } catch (Exception e){
            out.println("Error Occured: " + e);
        }
    }

    public boolean isUnique(int otp, int[] otpArray, int currentIndex) {
        for (int i=0;i<currentIndex;i++){
            if (otpArray[i] == otp) {
                return false;
            } 
        }
        return true;
    }

    public int generateOTP(){
        int min = 100000;
        int max = 999999;
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}