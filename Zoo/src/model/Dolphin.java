package model;

/**
 * @author chumb - djackson16
 * CIS175 - Spring 2024
 * Jan 26, 2024
 */
public class Dolphin {
	// declare variables
	private String name;
    private int age;
    private String color;

    //default constructor
    public Dolphin() {
    	
    }

    //constructor
    public Dolphin(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    //getters and setters
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
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//speak method prints dolphin noise
    public String speak() {
        return "eeeeeeeee tehehehehe eep";
    }
}
