package exercises;

public class SmurfRunner {

	public static void main(String[] args) {
		
		Smurf handySmurf = new Smurf("Handy");
		handySmurf.eat();
		System.out.println(handySmurf.getName());
		
		System.out.println();
		
		Smurf papaSmurf = new Smurf("Papa");
		System.out.println(papaSmurf.getName());
		System.out.println(papaSmurf.getHatColor());
		System.out.println(papaSmurf.isGirlOrBoy());
		
		System.out.println();
		
		Smurf smurfette = new Smurf("Smurfette");
		System.out.println(smurfette.getName());
		System.out.println(smurfette.getHatColor());
		System.out.println(smurfette.isGirlOrBoy());
		
	}
	
}
