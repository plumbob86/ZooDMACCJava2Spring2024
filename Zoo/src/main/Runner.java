package main;

import java.io.Console;

import model.Budgerigar;
import model.Example;

public class Runner {

	public static void main(String[] args) {
		Runner run = new Runner();
		run.go();
	}

	private void go() {
		Example example = new Example();
		Budgerigar budgie = new Budgerigar();
		System.out.println(example.makeNoise());
		System.out.println(budgie.makeNoise());
	}
}
