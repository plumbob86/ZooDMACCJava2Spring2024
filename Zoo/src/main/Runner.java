package main;

import model.Example;
import model.Wallaby;

public class Runner {

	public static void main(String[] args) {
		Runner run = new Runner();
		run.go();
	}

	private void go() {
		Example example = new Example();
		example.makeNoise();
		
		Wallaby wallaby = new Wallaby("Bob", 4, "grey");
		wallaby.speak();
		
		System.out.println(wallaby.speak());
		
	}
}
