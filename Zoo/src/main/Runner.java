package main;

import model.Bat;
import model.Example;

public class Runner {

	public static void main(String[] args) {
		Runner run = new Runner();
		run.go();
		run.flyingFoxes("Fruit Bat", "Fruit", 33);
	}

	private void go() {
		Example example = new Example();
		example.makeNoise();
		
	}
	
	private void flyingFoxes(String name, String diet, int wingSize) {
		Bat bat = new Bat(name, diet, wingSize);
		System.out.println(bat.makeNoise());
	}
}
