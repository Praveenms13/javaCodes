
import static java.lang.System.out;
import java.util.Scanner;

public class program1 {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            double[] salary = new double[10];
            double[] servicePeriod = new double[10];
            double[] bonus = new double[10];
            double[] newSalary = new double[10];
            float totalBonus = 0;
            float totalNewSalary = 0;
            float totalOldSalary = 0;
            out.println("Enter the details of 10 employees");
            for (int i = 0; i < salary.length; i++) {
                out.print("Enter Employee " + (i + 1) + "'s salary> ");
                salary[i] = scanner.nextDouble();
                if (salary[i] < 0) {
                    out.println("Invalid salary");
                    i--;
                    continue;
                }
                out.print("Enter Employee " + (i + 1) + "'s service period> ");
                servicePeriod[i] = scanner.nextDouble();
                if (servicePeriod[i] < 0 && salary[i] < 0) {
                    out.println("Invalid service period, Enter the details again.");
                    i--;
                    continue;
                }
            }

            for (int i = 0; i < 10; i++) {
                if (servicePeriod[i] >= 5) {
                    bonus[i] = salary[i] * 0.05;
                    newSalary[i] = salary[i] + bonus[i];
                    totalBonus += bonus[i];
                    totalNewSalary += newSalary[i];
                    totalOldSalary += salary[i];
                }
            }
            out.println("Total bonus paid to employees: " + totalBonus);
            out.println("Total new salary paid to employees: " + totalNewSalary);
            out.println("Total old salary paid to employees: " + totalOldSalary);
            scanner.close();
        } catch (Exception e) {
            out.println("Error occurred" + e);
        }
    }
}
