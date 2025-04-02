import java.util.Scanner;
import static java.lang.System.out;
public class program9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {
            out.print("Enter the size of the rows> ");
            int rows = scanner.nextInt();

            out.print("Enter the size of the columns> ");
            int columns = scanner.nextInt();

            int[][] twoDim = new int[rows][columns];
            int[] oneDim = new int[rows * columns];
            int index = 0;

            out.println("Enter the array elements> ");
            for (int i=0;i<rows;i++) {
                for (int j=0;j<columns;j++) {
                    twoDim[i][j] = scanner.nextInt();
                }
            }

            for (int i=0;i<rows;i++) {
                for (int j=0;j<columns;j++) {
                    oneDim[index++] = twoDim[i][j];
                }
            }
            out.println("Multi dimensional array: ");
            for (int i=0;i<rows;i++) {
                for (int j=0;j<columns;j++) {
                    out.print(twoDim[i][j] + " ");
                } out.println();
            }
            out.println("Single dimensional array: ");
            for (int i = 0;i<oneDim.length;i++) {
                out.print(oneDim[i] + " ");
            }
		} catch (Exception e) {
			out.println("Error occurred" + e);
		}
		scanner.close();
    }
}