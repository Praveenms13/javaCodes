import static java.lang.System.out;
import java.util.Scanner;
import java.util.Arrays;
public class NumberChecker  {
    public static void main(String args[]){
        try {
            Scanner scanner = new Scanner(System.in);
            out.print("Enter the Month: ");
            int month = scanner.nextInt();
            if (month > 12 || month < 1) {  
                out.println("Invalid Month");
                System.exit(0);
            }
            out.print("Enter the Year: ");
            int year = scanner.nextInt();
            if (year < 1582){
                out.println("Invalid Year");
                System.exit(0);
            }
            NumberChecker numberCheckerObj = new NumberChecker();
            boolean isLeapYear = numberCheckerObj.isLeapYear(year);
            String getMonth = numberCheckerObj.getMonthName(month);
            int getNoOfDays = numberCheckerObj.getNoOfDaysInAMonth(month, isLeapYear);
            int startDay = numberCheckerObj.getFirstDayOfTheMonth(month, year);
            numberCheckerObj.displayCalender(getMonth, year, startDay, getNoOfDays);
        } catch (Exception e){
            out.println("Error Occured: " + e);
        }
    }

    public String getMonthName(int monthInt){
        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"};
        return month[monthInt - 1];
    }
    public boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public int getNoOfDaysInAMonth(int month, boolean isLeapYear){
        int[] noOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear){
            noOfDays[1] = 29;
        }
        return noOfDays[month - 1];
    }
    public int getFirstDayOfTheMonth(int m, int y){
        int d = 1;
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0;
    }
    public void displayCalender(String month, int year, int startDay, int noOfDays) {
        out.println("\n" + month + " " + year);
        out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < startDay; i++) {
            out.print("    ");
        }
        for (int i = 1; i <= noOfDays; i++) {
            out.printf("%3d ", i); 
            if ((i + startDay) % 7 == 0) {
                out.println();
            }
        }
        out.println("\n");
    }
}