package model;

/**
 * @author Misti Christianson - mchristianson
 * CIS175 - Spring 2024
 * Jan 24, 2024
 */
public class Bat {
	private String name;
	private String diet;
	private int wingSize;

	public Bat() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Bat(String name, String diet, int wingSize) {
		super();
		this.name = name;
		this.diet = diet;
		this.wingSize = wingSize;
	}

	public String makeNoise() {
		return "Screech";
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the diet
	 */
	public String getDiet() {
		return diet;
	}


	/**
	 * @param diet the diet to set
	 */
	public void setDiet(String diet) {
		this.diet = diet;
	}


	/**
	 * @return the wingSize
	 */
	public int getWingSize() {
		return wingSize;
	}


	/**
	 * @param wingSize the wingSize to set
	 */
	public void setWingSize(int wingSize) {
		this.wingSize = wingSize;
	}


	@Override
	public String toString() {
		return "Bat [name=" + name + ", diet=" + diet + ", wingSize=" + wingSize + "]";
	}
	
	
}
