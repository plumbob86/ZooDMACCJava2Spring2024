package model;

public class Cow{
    private String breed;
    private String name;
    private int age;
    private String color;

    // Default constructor
    public Cow() {
        super();
    }

    /**
     * Parameterized constructor for cow class
     * @param breed The breed of the cow
     * @param name The name of the cow
     * @param age The age of the cow
     * @param color The color of the cow
     */
    public Cow(String breed, String name, int age, String color) {
        super();
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.color = color;
    }


    public String getBreed() {
        return breed;
    }


    public void setBreed(String breed) {
        this.breed = breed;
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


    public String getColor() {
        return color;
    }

  void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cow [name=" + name + ", breed=" + breed + ", age=" + age + ", color=" + color + "]";
    }

  
    public String makeNoise() {
        return "Mooooo!";
    }
}