/**
 * @author Cory Howard - clhoward1
 * CIS175 - Spring 2024
 * Jan 25, 2024
 */
package model;

public class Elephant {
	private String habitat;
	private String name;
	private double length;


	/**
	 * Constructors
	 */
	public Elephant() {
		super();
	}

	public Elephant(String habitat, String name, double length) {
		super();
		this.habitat = habitat;
		this.name = name;
		this.length = length;
	}


	/**
	 * Getters and Setters
	 */
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public double getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Example [name=" + name + ", length=" + length + "inches, habitat=" + habitat + "]";
	}

	public String makeNoise() {
		return "Toot!";
	}
}