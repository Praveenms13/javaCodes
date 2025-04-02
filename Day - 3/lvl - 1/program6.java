import java.util.Scanner;
import static java.lang.System.out;
public class program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
            double heights[] = new double[3];
            double total = 0.0;
            for (int i=0;i<heights.length;i++) {
                out.print("Enter height " + (i+1) + "> ");
                heights[i] = scanner.nextDouble();
                if (heights[i] < 0) {
                    out.println("Invalid height");
                    System.exit(0);
                } else {
                    total += heights[i];
                }
            }
            double sum = total / heights.length;
            out.printf("The average height is %.2f" , sum);
		} catch (Exception e) {
			out.println("Error occurred" + e);
		}
		scanner.close();
    }
}