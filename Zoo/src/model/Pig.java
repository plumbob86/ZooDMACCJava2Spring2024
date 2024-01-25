package model;

/**
 * @author mallorykeary empope1
 * CIS 175 Spring 2024
 * Jan 24, 2024
 */
public class Pig {

	//Instance variables
	private String habitat;
	private String breed;
	private String color;
	
	//constructors
	public Pig() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Pig(String habitat, String breed, String color) {
		super();
		this.habitat = habitat;
		this.breed = breed;
		this.color = color;
	}

	//Getters and setters
	public String getHabitat() {
		return habitat;
	}


	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}


	public String getBreed() {
		return breed;
	}


	public void setBreed(String breed) {
		this.breed = breed;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Pig [habitat=" + habitat + ", breed=" + breed + ", color=" + color + "]";
	}
	
	//makeNoise method
	public String makeNoise() {
		return "The " + color + " " + breed + " Pig goes OINK!!";
	}
}
