package model;

public class Raven {
    // Private instance variables to store Raven properties
    private String habitat;
    private String name;
    private int length;
    private String featherColor;

    // Constructor to initialize Raven object with specified properties
    public Raven(String habitat, String name, int length, String featherColor) {
        this.habitat = habitat;
        this.name = name;
        this.length = length;
        this.featherColor = featherColor;
    }

    // Getter method for habitat
    public String getHabitat() {
        return habitat;
    }

    // Setter method for habitat
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for length
    public int getLength() {
        return length;
    }

    // Setter method for length
    public void setLength(int length) {
        this.length = length;
    }

    // Getter method for featherColor
    public String getFeatherColor() {
        return featherColor;
    }

    // Setter method for featherColor
    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    // Override toString method to provide a string representation of the Raven object
    @Override
    public String toString() {
        return "Raven [name=" + name + ", length=" + length + " inches, habitat=" + habitat +
               ", featherColor=" + featherColor + "]";
    }

    // Method to simulate the noise a Raven makes
    public String makeNoise() {
        return "Caw! Caw!";
    }
}