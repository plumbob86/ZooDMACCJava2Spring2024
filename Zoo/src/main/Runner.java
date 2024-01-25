package main;

import model.Example;
import model.Cat;

public class Runner {

	public static void main(String[] args) {
		Runner run = new Runner();
		run.go();
	}

	private void go() {
		Example example = new Example();
		example.makeNoise();
		Cat cat = new Cat();
		cat.speak();
		
	}
}
