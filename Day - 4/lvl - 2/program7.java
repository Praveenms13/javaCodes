import static java.lang.System.out;
import java.util.Scanner;
import java.time.*; 
public class StudentVoteChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
            int[] studentAge = new int[10];
            StudentVoteChecker StudentVoteCheckerObj = new StudentVoteChecker();
            for (int i=0;i<studentAge.length;i++){
                out.printf("Enter student %d's age> ", (i+1));
                studentAge[i] = scanner.nextInt();
            }
            for (int i=0;i<studentAge.length;i++){
                if (StudentVoteCheckerObj.canStudentVote(studentAge[i])){
                    out.printf("Student %d Can Vote.\n", i + 1); 
                } else {
                    out.println("Student " + (i + 1) + " Can Vote.");
                }
            }
        } catch (Exception e) {
			out.printf("Error occurred" + e);
		}
		scanner.close();
    }
    public boolean canStudentVote(int age) {
        if (age <= 0){
            return false;
        }
        if (age >= 18){
            return true;
        } else {
            return false;
        }
    }
}