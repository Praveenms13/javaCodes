import static java.lang.System.out;
import java.util.Scanner;
import java.util.Arrays;
public class EuclideanDistance  {
    public static void main(String args[]){
        try {
            Scanner scanner = new Scanner(System.in);
            out.print("Enter X1: ");
            int x1 = scanner.nextInt();
            out.print("Enter Y1: ");
            int y1 = scanner.nextInt();
            out.print("Enter X2: ");
            int x2 = scanner.nextInt();
            out.print("Enter Y2: ");
            int y2 = scanner.nextInt();
            out.print("Enter X3: ");
            int x3 = scanner.nextInt();
            out.print("Enter Y3: ");
            int y3 = scanner.nextInt();
            EuclideanDistance euclideanDistanceObj = new EuclideanDistance();
            out.println(euclideanDistanceObj.findEuclideanDistance(x1, x2, y1, y2));
        } catch (Exception e){
            out.println("Error Occured: " + e);
        }
    }
    public double findEuclideanDistance(int x1, int x2, int y1, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}