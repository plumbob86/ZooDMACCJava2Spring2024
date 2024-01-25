package model;

public class Cat {
	private String sound = "Meow";
	private int age;
	private String name;
	
	public Cat(String sound, int age, String name) {
		this.sound = sound;
		this.age = age;
		this.name = name;
	}
	
	public Cat() {
	}

	public void speak() {
		System.out.println(this.sound);
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

