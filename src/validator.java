import java.util.*;

public class validator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		getIntInRange(scan, "Please select a number from the list.", 1, 9);

	}
	
	public static int getIntInRange (Scanner scan, String prompt, int min, int max) {
		
		
		while (true) {
			
			System.out.println(prompt);
			
			try {
				int input = scan.nextInt();
				if (input < min || input > max) {
					scan.nextLine();
					System.out.println("Please try again and enter number from the list.");
				} else {
					return input;
				}
			} catch (InputMismatchException e) {  //for integer and string mismatch of the value entered e.g one != 1
		
				scan.nextLine();
				System.out.println("Sorry wrong number. Please try again.");
			}
	}
	}
}
