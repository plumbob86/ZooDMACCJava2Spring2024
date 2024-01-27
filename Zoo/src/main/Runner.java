package main;

import model.Example;
import model.Dolphin;

public class Runner {

	public static void main(String[] args) {
		Runner run = new Runner();
		run.go();
	}

	private void go() {
		Example example = new Example();
		example.makeNoise();
		
		//create dolphin object and call speak method
		Dolphin dolphin1 = new Dolphin("Tony", 23, "blue");
		System.out.println(dolphin1.speak());
	}
}
