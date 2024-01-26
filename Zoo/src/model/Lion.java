package model;

//lion class
public class Lion {
    //lion properties 
    private String habitat;
    private String name;
    private int lengthInInches;
    private int heightInInches;
    private String subspecies;
    private String color;
    private String maneColor;

    //default constructor
    public Lion() {
        super();
    }

    //constructor for creating new Lion obj
    public Lion(String name, int lengthInInches, String habitat, int heightInInches, String subspecies, String color, String maneColor) {
        super();
        this.name = name;
        this.lengthInInches = lengthInInches;
        this.habitat = habitat;
        this.heightInInches = heightInInches;
        this.subspecies = subspecies;
        this.color = color;
        this.maneColor = maneColor;
    }

    //getters and setters for lion properties
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

    public int getLengthInInches() {
        return lengthInInches;
    }

    public void setLengthInInches(int lengthInInches) {
        this.lengthInInches = lengthInInches;
    }

    public int getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(int heightInInches) {
        this.heightInInches = heightInInches;
    }

    public String getSubspecies() {
        return subspecies;
    }

    public void setSubspecies(String subspecies) {
        this.subspecies = subspecies;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManeColor() {
        return maneColor;
    }

    public void setManeColor(String maneColor) {
        this.maneColor = maneColor;
    }

    //method for lion to speak
    public String speak() {
        return "Roar!";
    }
}