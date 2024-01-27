/**
 * @author deondaigh - dmdaigh
 * CIS175 - Spring 2024
 * Jan 26, 2024
 */
package model;

/**
 * @author deondaigh
 *
 */
public class Tiger {
	private String habitat;

	/**
	 * @param habitat
	 */
	public Tiger(String habitat) {
		super();
		this.habitat = habitat;
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
	
	public String MakeNoise() {
		return "Roar";
	}
}
