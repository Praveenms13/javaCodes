import java.util.Random;

public class EmployeeBonus {
    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData(10);
        double[][] updatedSalaries = calculateBonuses(employeeData);
        displayResults(employeeData, updatedSalaries);
    }

    public static int[][] generateEmployeeData(int numEmployees) {
        Random random = new Random();
        int[][] data = new int[numEmployees][2]; 
        
        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = 10000 + random.nextInt(90000); 
            data[i][1] = random.nextInt(11);
        }
        
        return data;
    }

    public static double[][] calculateBonuses(int[][] employeeData) {
        int numEmployees = employeeData.length;
        double[][] updatedData = new double[numEmployees][2]; 
        
        for (int i = 0; i < numEmployees; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonusPercentage = (years > 5) ? 0.05 : 0.02;
            double bonusAmount = salary * bonusPercentage;
            double newSalary = salary + bonusAmount;
            
            updatedData[i][0] = Math.round(newSalary * 100.0) / 100.0;
            updatedData[i][1] = Math.round(bonusAmount * 100.0) / 100.0;
        }
        
        return updatedData;
    }

    public static void displayResults(int[][] employeeData, double[][] updatedSalaries) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        
        System.out.println("\nEmployee Bonus Report:");
        System.out.println("EmpID\tOld Salary\tYears of Service\tBonus Amount\tNew Salary");
        
        for (int i = 0; i < employeeData.length; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(employeeData[i][0] + "\t");
            System.out.print(employeeData[i][1] + "\t\t");
            System.out.print(updatedSalaries[i][1] + "\t\t");
            System.out.println(updatedSalaries[i][0]);
            
            totalOldSalary += employeeData[i][0];
            totalNewSalary += updatedSalaries[i][0];
            totalBonus += updatedSalaries[i][1];
        }
        
        System.out.println("\nTotal Old Salary: " + Math.round(totalOldSalary * 100.0) / 100.0);
        System.out.println("Total New Salary: " + Math.round(totalNewSalary * 100.0) / 100.0);
        System.out.println("Total Bonus Paid: " + Math.round(totalBonus * 100.0) / 100.0);
    }
}