package main;

import model.Example;

public class Runner {

	public static void main(String[] args) {
<<<<<<< Updated upstream
		Runner run = new Runner();
		run.go();
=======
		Bird birdObject = new Bird("woodlands","Robin", 9);
		birdObject.makeNoise();
		
		System.out.println(birdObject.toString());
		System.out.println(birdObject.makeNoise());

>>>>>>> Stashed changes
	}

	private void go() {
		Example example = new Example();
		example.makeNoise();
		
	}
}
