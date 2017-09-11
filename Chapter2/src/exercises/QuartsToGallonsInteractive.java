package exercises;

import java.util.Scanner;

public class QuartsToGallonsInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int quartsInGallons = 4;
		
		int quartsNeeded;
		int gallonsNeeded, extraQuarts;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter quarts needed >> ");
		quartsNeeded = input.nextInt();
		
		gallonsNeeded = quartsNeeded / quartsInGallons;
		extraQuarts = quartsNeeded % quartsInGallons;
		
		System.out.println("You have " + gallonsNeeded + " gallons and " + extraQuarts + " quarts left over");
	}

}
