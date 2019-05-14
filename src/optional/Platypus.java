package optional;

import java.util.Scanner;

public class Platypus {
	private String name;
	
	public Platypus() {
		Scanner scan = new Scanner(System.in);
		System.out.println("You have a new pet!");
		System.out.print("Give them a name: ");
		this.name = scan.next();
		scan.close();
	}

	void sayHi(){
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
	}
	
	public static void main(String[] args) {
		//1. Make an instance of your new pet platypus
		Platypus platypus = new Platypus();
		//2. Call the sayHi method
		platypus.sayHi();
		//3. Create a constructor in the platypus class so that you can give your platypus a name.
	}
}


