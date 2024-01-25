package main;

import model.Snake;

public class Runner {

	public static void main(String[] args) {
		Runner run = new Runner();
		run.go();
	}

	private void go() {
		Snake example = new Snake("Jungle", "Vipr", 34);
		System.out.println(example);
		System.out.println(example.getName() + " the snake goes, " + example.makeNoise());
		
	}
}
