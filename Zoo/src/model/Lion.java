package model;

/**
 * Maya Cruz - Gcruz
 * CIS175 - Spring 2024
 * Jan 28, 2024
 */
public class Lion {
	private String habitat;
	private String name;
	private int age;
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * 
	 */
	public Lion() {
		super();
	}
	/**
	 * @param habitat
	 * @param name
	 * @param age
	 */
	public Lion(String habitat, String name, int age) {
		super();
		this.habitat = habitat;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Lion [habitat=" + habitat + ", name=" + name + ", age=" + age + "]";
	}
	public String makeNoise() {
		return "Roar";
	}
}
