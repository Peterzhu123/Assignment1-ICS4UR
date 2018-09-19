/**************************************************************************
 *
 * Created by: Peter Zhu
 * Created on: Sep 
 * This is a string blow up
 *
 ****************************************************************************/
import java.util.Scanner;

public class StringBlowUpVersion1 {

	public static void main(String[] args) {
		int check = 0;
		
		System.out.println("Enter a string. You can include number and letters ");
		
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
				
		if(userInput.length() <= 0) {
			System.out.print("Please input a string !");
		}
		for(int counter = 0; counter < userInput.length();counter ++) {			
			char now = userInput.charAt(check);
			
			if(Character.isDigit(now) && check < userInput.length() - 1) {
				char next = userInput.charAt(check + 1);
				int repeat = Integer.parseInt(Character.toString(now));
				
				for(int value = 0; value < repeat; value ++) {
					System.out.print(next);
				}
				
				check++;
			}else if(Character.isLetter(now)) {
				System.out.print(now);
				check++;
			}
		}
		
	}

}
