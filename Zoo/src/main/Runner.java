package main;

import model.Example;
import model.Pig;

public class Runner {

	public static void main(String[] args) {
		Runner run = new Runner();
		run.go();
	}

	private void go() {
		Example example = new Example();
		example.makeNoise();
		
		//create instance of animal and print results
		Pig pig = new Pig ("Field", "Yorkshire", "Pink");
		
		System.out.println(pig.makeNoise());
		
	}
}
