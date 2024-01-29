package main;

import model.Cow;

public class Runner {

	public static void main(String[] args) {
		Runner run = new Runner();
		run.go();
	}

private void go() {
		
		//create instance of animal and print results
		Cow myCow = new Cow("Beefalo", "Maggie", 6, "Brown");
		
		System.out.println("Cow says: " + myCow.makeNoise());
	
	}
}
