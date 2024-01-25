package model;

public class Snake {
	private String habitat;
	private String name;
	private int length;

	//For Git Demo!
	public Snake() {
		super();
		// TODO Auto-generated constructor stub
		// Test Comment
	}

	/**
	 * @param habitat
	 * @param name
	 * @param length
	 */
	public Snake(String habitat, String name, int length) {
		super();
		this.habitat = habitat;
		this.name = name;
		this.length = length;
	}

	/**
	 * @return the habitat
	 */
	public String getHabitat() {
		return habitat;
	}

	/**
	 * @param habitat the habitat to set
	 */
	public void setHabitat(String habitat) {
		this.habitat = habitat;
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
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Snake: [name=" + name + ", length=" + length + "inches, habitat=" + habitat + "]";
	}

	public String makeNoise() {
		return "Hisssss!";
	}
}
