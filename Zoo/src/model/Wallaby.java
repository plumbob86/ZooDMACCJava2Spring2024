package model;

/**
 * @author joshtegeler - jmtegeler
 * CIS175 - Spring 2024
 * Jan 25, 2024
 */

public class Wallaby {
	
    private String name;
    private int age;
    private String color;

    public Wallaby() {
    	super();
    }
    
    // Constructor
    public Wallaby(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // Getters/setters
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


	// Speak method
    public String speak() {
        return "The " + color + " Wallaby named " + name + " is " + age + " years old and goes 'growllllll'";
    }
}

