package main;

import model.Example;
import model.Lion;

public class Runner {

	public static void main(String[] args) {
		Runner run = new Runner();
		run.go();
	}

	private void go() {
		Example example = new Example("Habitat", "ExampleName", 10);
		System.out.println(example.makeNoise());
        
		//creating a Northern lion
        Lion northernLion = new Lion("Leo", 41, "West Africa", 37, "Panthera leo leo", "Golden", "Light");
        System.out.println(northernLion.getName() + ", a " + northernLion.getSubspecies() + " lion, lives in " + northernLion.getHabitat() + ". It is " + northernLion.getLengthInInches() + " inches long and " + northernLion.getHeightInInches() + " inches tall. It has a " + northernLion.getColor() + " color and a " + northernLion.getManeColor() + " mane. It says: " + northernLion.speak());

        //creating Southern lion
        Lion southernLion = new Lion("Nala", 49, "East Africa", 36, "Panthera leo melanochaita", "Golden", "Dark");
        System.out.println(southernLion.getName() + ", a " + southernLion.getSubspecies() + " lion, lives in " + southernLion.getHabitat() + ". It is " + southernLion.getLengthInInches() + " inches long and " + southernLion.getHeightInInches() + " inches tall. It has a " + southernLion.getColor() + " color and a " + southernLion.getManeColor() + " mane. It says: " + southernLion.speak());
	}
}