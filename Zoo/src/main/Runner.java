package main;
import model.Tiger;

public class Runner {

	public static void main(String[] args) {
		Runner run = new Runner();
		run.go();
	}

	private void go() {
		Tiger tiger = new Tiger("Jungle");
		
		System.out.println(tiger.MakeNoise());
	}
}
