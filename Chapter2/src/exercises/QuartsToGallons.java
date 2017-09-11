package exercises;

public class QuartsToGallons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int quartsInGallons = 4;
		
		int quartsNeeded = 18;
		int gallonsNeeded, extraQuarts;
		
		gallonsNeeded = quartsNeeded / quartsInGallons;
		extraQuarts = quartsNeeded % quartsInGallons;
		
		System.out.println("You have " + gallonsNeeded + " gallons and " + extraQuarts + " quarts left over");
	}

}
