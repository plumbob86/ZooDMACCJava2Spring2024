package main;

import model.Example;
import model.Koala;

public class Runner {

	public static void main(String[] args) {
		Runner run = new Runner();
		run.go();
	}

	private void go() {
		Example example = new Example();
		example.makeNoise();
		
		Koala koala = new Koala("Forest", "Jim", 73.5);
		System.out.println(koala.makeNoise());
		
	}
}
