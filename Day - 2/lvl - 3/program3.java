import java.util.Scanner;
import static java.lang.System.out;
public class program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
			out.print("Enter your physics mark: ");
			float physicsMark = scanner.nextInt();
			
			out.print("Enter your chemistry mark: ");
			float chemistryMark = scanner.nextInt();
			
			out.print("Enter your maths mark: ");
			float mathsMark = scanner.nextInt();
			
			float totalMarks = physicsMark + chemistryMark + mathsMark;
			float percentage = ((totalMarks / (100 * 3)) * 100);
			out.println(percentage);
			if (percentage >= 80 && percentage <=100) {
				out.println("Congratulations !!, You've Secured Grade A");
			} else if (percentage >= 70 && percentage <=79) {
				out.println("Congratulations !!, You've Secured Grade B");
			} else if (percentage >= 60 && percentage <=69) {
				out.println("You've Secured Grade C");
			} else if (percentage >= 50 && percentage <=59) {
				out.println("You've Secured Grade D");
			} else if (percentage >= 40 && percentage <=49) {
				out.println("You've Secured Grade E");
			} else if (percentage <= 39) {
				out.println("Sorry !!, You've Secured Grade R");
			}
		} catch (Exception e) {
			out.println("Error occurred: " + e);
		}
		scanner.close();
    }
}