package main;

import model.Example;

public class Runner {

	public static void main(String[] args) {
		Runner run = new Runner();
		run.go();
	}

	private void go() {
		Lion wildLion = new Lion("Africa", "Teddy", 4);
		System.out.println("The lion says " + wildLion.makeNoise());
	}
}
