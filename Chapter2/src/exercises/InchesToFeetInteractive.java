package exercises;

import java.util.Scanner;

public class InchesToFeetInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inches;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount of inches >> ");
		inches = input.nextInt();
		
		
		final int feet = inches / 12;
		final int inchesLeftOver = inches % 12;
		
		if (feet == 1 && inchesLeftOver == 1) {
			System.out.println("There is " + feet + " foot and " + inchesLeftOver + " inch in " + inches + " inches.");
		}
		if (feet == 1 && inchesLeftOver != 1) {
			System.out.println("There is " + feet + " foot and " + inchesLeftOver + " inches in " + inches + " inches.");
		}
		if (feet != 1 && inchesLeftOver == 1 && inches != 1) {
			System.out.println("There are " + feet + " feet and " + inchesLeftOver + " inch in " + inches + " inches.");
		}
		if (feet != 1 && inchesLeftOver != 1) {
			System.out.println("There are " + feet + " feet and " + inchesLeftOver + " inches in " + inches + " inches.");
		}
		if (feet != 1 && inchesLeftOver == 1 && inches == 1) {
			System.out.println("There are " + feet + " feet and " + inchesLeftOver + " inch in " + inches + " inch.");
		}
	}

}
