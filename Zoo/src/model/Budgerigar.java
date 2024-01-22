/**
 * @author Mandy Wiedmier - mwiedmier2
 * CIS175 - Spring 2024
 * Jan 22, 2024
 */
package model;

/**
 * Budgerigar class for the Github demo
 */
public class Budgerigar {
	private String habitat;
	private String name;
	private String favoriteTreat;
	private int height;
	private int feathers;
	private double weight;
	
	public Budgerigar() {
		super();
		// TODO Auto-generated constructor stub
		// Test Comment for this new class
	}

	/**
	 * @param habitat
	 * @param name
	 * @param length
	 */
	public Budgerigar(String habitat, String name, int height) {
		super();
		this.habitat = habitat;
		this.name = name;
		this.height = height;
	}
	/**
	 * @param habitat
	 * @param name
	 * @param favoriteTreat
	 * @param height
	 * @param feathers
	 * @param weight
	 */
	public Budgerigar(String habitat, String name, String favoriteTreat, int height, int feathers, double weight) {
		super();
		this.habitat = habitat;
		this.name = name;
		this.favoriteTreat = favoriteTreat;
		this.height = height;
		this.feathers = feathers;
		this.weight = weight;
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
	 * @return the favoriteTreat
	 */
	public String getFavoriteTreat() {
		return favoriteTreat;
	}

	/**
	 * @param favoriteTreat the favoriteTreat to set
	 */
	public void setFavoriteTreat(String favoriteTreat) {
		this.favoriteTreat = favoriteTreat;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param length the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @return the feathers
	 */
	public int getFeathers() {
		return feathers;
	}

	/**
	 * @param feathers the feathers to set
	 */
	public void setFeathers(int feathers) {
		this.feathers = feathers;
	}


	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Budgerigar [habitat=" + habitat + ", name=" + name + ", favoriteTreat=" + favoriteTreat + ", height="
				+ height + ", feathers=" + feathers + ", weight=" + weight + "]";
	}

	public String makeNoise() {
		return "Tweet tweet chirp!";
	}
}
