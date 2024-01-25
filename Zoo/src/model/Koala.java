package model;

/**
 * @author Jeff Johnson - jjohnson190
 * CIS175 - Spring 2024
 * Jan 24, 2024
 */
public class Koala {

	private String habitat;
	private String name;
	private double length;
	
	public Koala() {
		super();
	}
	
	public Koala(String habitat, String name, double length) {
		super();
		this.habitat = habitat;
		this.name = name;
		this.length = length;
	}
	
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
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public String makeNoise() {
		return "*grunt*";
	}
	
}
