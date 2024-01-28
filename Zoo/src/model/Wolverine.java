/**
 * @author Blake Dykstra - bdykstra
 * CIS175 - Spring 2024
 * Jan 27, 2024
 */
package model;

/**
 * 
 */
public class Wolverine {
	private String name;
	private int age;
	private boolean male;
	
	public Wolverine() {}
	
	public Wolverine(String name, int age, boolean male) {
		this.name = name;
		this.age = age;
		this.male = male;
	}
	
	public String growl() {
		return "Grrrrr...";
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean getGender() {
		return male;
	}
	
	public void setGender(boolean male) {
		this.male = male;
	}
}
