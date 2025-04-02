import java.util.Scanner;
public class program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
			System.out.print("Enter amar's age: ");		
			int amarAge = scanner.nextInt();
			
			System.out.print("Enter amar's height: ");		
			int amarHeight = scanner.nextInt();
			
			System.out.print("Enter akbar's age: ");		
			int akbarAge = scanner.nextInt();
			
			System.out.print("Enter akbar's height: ");		
			int akbarHeight = scanner.nextInt();
			
			System.out.print("Enter anthony's age: ");		
			int anthonyAge = scanner.nextInt();
			
			System.out.print("Enter anthony's height: ");		
			int anthonyHeight = scanner.nextInt();
			
			int minAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
			if (amarAge < akbarAge && amarAge < anthonyAge){
				System.out.println("The Youngest of three friends is Amar");
			} else if (akbarAge < amarAge && akbarAge < anthonyAge) {
				System.out.println("The Youngest of three friends is Akbar");
			} else {
				System.out.println("The Youngest of three friends is Anthony");
			}
			
			int tallest = Math.min(amarHeight, Math.min(akbarHeight, anthonyHeight));
			if (amarHeight > akbarHeight && amarHeight > anthonyHeight){
				System.out.println("The Tallest of three friends is Amar");
			} else if (akbarHeight < amarHeight && akbarHeight < anthonyHeight) {
				System.out.println("The Tallest of three friends is Akbar");
			} else {
				System.out.println("The Tallest of three friends is Anthony");
			}
		} catch (Exception e) {
			System.out.println("Invalid Input Detected.");
		}
		scanner.close();
    }
}