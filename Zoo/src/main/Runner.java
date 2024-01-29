package main;

import model.Example;
import model.Cat;

public class Runner {

	public static void main(String[] args) {
		Runner run = new Runner();
		run.go();
	}

	private void go() {
		Cat myCat =new Cat("Indoors", "Chloe", 6);
		System.out.println("My cat says: " + myCat.makeNoise());
		
	}
}
