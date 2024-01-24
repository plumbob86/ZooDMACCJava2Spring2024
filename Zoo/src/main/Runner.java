package main;

import model.Example;
import model.Penguin;

public class Runner {

	public static void main(String[] args) {
		Runner run = new Runner();
		run.go();
	}

	private void go() {
		Example example = new Example();
		System.out.println(example.makeNoise());
		
		// Creating an instance of the Penguin class
		Penguin penguin = new Penguin("Emperor", "Antarctica", 100);
		
		// Making the penguin go HONK!!!!
		System.out.println(penguin.makeNoise());
		
	}
}
