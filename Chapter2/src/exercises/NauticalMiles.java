package exercises;

public class NauticalMiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double kilometersInNauticalMile = 1.852, milesInNauticalMile = 1.150779;
		
		int NauticalMiles = 5;
		
		final double kilometers = NauticalMiles * kilometersInNauticalMile;
		final double miles = NauticalMiles * milesInNauticalMile;
		
		System.out.println("The conversion factor for nautical miles to kilometers is " + kilometersInNauticalMile + ".");
		System.out.println("There are " + kilometers + " kilometers in " + NauticalMiles + " nautical miles.");
		System.out.println("The conversion factor for nautical miles to miles is " + milesInNauticalMile + ".");
		System.out.println("There are " + miles + " miles in " + NauticalMiles + " nautical miles.");
	}

}
