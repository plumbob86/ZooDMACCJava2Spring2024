package main;

import model.Wolverine

public class Runner {

	public static void main(String[] args) {
		Runner run = new Runner();
		run.go();
	}

	private void go() {
		Wolverine sue = new Wolverine("Sue", 3, false);
		System.out.println(sue.growl());
		
	}
}
