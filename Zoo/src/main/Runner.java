package main;

import model.Crow;
import model.Example;

public class Runner {

	public static void main(String[] args) {
		Runner run = new Runner();
		run.go();
	}

	private void go() {
		Example example = new Example();
		example.makeNoise();
		
		Crow crow = new Crow();
		System.out.println(crow.makeNoise());		
	}
}
