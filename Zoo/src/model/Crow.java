/**
 * Author: Daniel Lebedev - dalebedev 
 * Description: XXX
 * CIS 175 - Spring 2024
 * Feb 2, 2024
 */
package model;

public class Crow {
	
	private String name;
	private String color;
	private float wingspan;
	
	public Crow() {
		super();
	}
	
	public Crow(String name, String color, float wingspan) {
		super();
		this.name = name;
		this.color = color;
		this.wingspan = wingspan;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getWingspan() {
		return wingspan;
	}

	public void setWingspan(float wingspan) {
		this.wingspan = wingspan;
	}
	
	@Override
	public String toString() {
		return "Crow: Name=" + this.name + "color=" + this.color + "Wingspan=" + this.wingspan;
	}
	
	public String makeNoise() {
		return "Caw Caw!";
	}
	
}
