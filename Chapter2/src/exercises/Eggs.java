package exercises;

import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eggs, eggsLeftOver, eggsInDozen;
		double priceForIndividualEggs, priceForDozen, price;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many eggs would you like to order? >> ");
		eggs = input.nextInt();
		System.out.println("You oredered " + eggs + " eggs.");
		
		eggsLeftOver = eggs % 12;
		priceForIndividualEggs = eggsLeftOver * .45;
		eggsInDozen = eggs / 12;
		priceForDozen = eggsInDozen * 3.25;
		price = priceForIndividualEggs + priceForDozen;
		
		System.out.println("That's " + eggsInDozen + " dozen at $3.25 per dozen and " + eggsLeftOver +
				" loose eggs at 45 cents each for a total of $" + price + ".");
		
		
		
		
	}

}
