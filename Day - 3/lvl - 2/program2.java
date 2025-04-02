
import static java.lang.System.out;
import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int[] heightArr = new int[3];
            int[] ageArr = new int[3];
            int youngest = 0;
            int tallest = 0;
            out.println("Enter the details of 3 persons");
            for (int i=0;i<heightArr.length;i++){
                out.print("Enter the height of person " + (i+1) + "> ");
                heightArr[i] = scanner.nextInt();
                if (heightArr[i] < 0){
                    out.println("Invalid height");
                    i--;
                    continue;
                }
                out.print("Enter the age of person " + (i+1) + "> ");
                ageArr[i] = scanner.nextInt();
                if (ageArr[i] < 0){
                    out.println("Invalid age");
                    i--;
                    continue;
                }
            }
            for (int i=0;i<heightArr.length;i++){
                youngest = ageArr[i];
                tallest = heightArr[i];
                for (int j=0;j<heightArr.length;j++){
                    if (youngest > ageArr[j]) {
                        youngest = ageArr[j];
                    }
                    if (tallest < heightArr[j]){
                        tallest = heightArr[j];
                    }
                }
            }
            out.println("Youngest of three is: " + youngest);
            out.println("Tallest of three is: " + tallest);
            scanner.close();
        } catch (Exception e) {
            out.println("Error occurred" + e);
        }
    }
}
