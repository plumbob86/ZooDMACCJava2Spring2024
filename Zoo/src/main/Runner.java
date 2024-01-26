package main;

import model.Elephant;
import model.Example;

public class Runner {

	public static void main(String[] args) {
		Runner run = new Runner();
		run.go();
	}

	private void go() {
		Example example = new Example();
		example.makeNoise();
		
		Elephant elephant = new Elephant("Savanna", "Blue", 28.4);
		
		System.out.println(elephant.makeNoise());
		
	}
}
