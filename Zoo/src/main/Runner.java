package main;

import model.Example;
import model.Raven; // Import the Raven class

public class Runner {

	public static void main(String[] args) {
		Runner run = new Runner();
		run.go();
	}

	private void go() {
		Example example = new Example();
		example.makeNoise();
		
		// Create a Raven object
        Raven raven = new Raven("Mountains", "Common Raven", 24, "Black");
        System.out.println("\nRaven:");
        System.out.println(raven); // Calls the toString() method implicitly
        System.out.println("Noise: " + raven.makeNoise()); // Calls the makeNoise() method
		
	}
}
