package main;
 
import model.dog;

public class Runner {

	public static void main(String[] args) {
		Runner run = new Runner();
		run.go();
	}

	private void go() {
		
		
		//create instance of animal and print results
		dog myDog = new dog("Labrador", "Max", 3, "Golden");
		
		System.out.println("My dog says: " + myDog.bark());


	}
}
