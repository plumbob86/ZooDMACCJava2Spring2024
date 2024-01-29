package model;

/**
 * Larry Paucar - Lpaucar
 * CIS175 -Spring 2024
 * Jan 28, 2024
 */
public class Cat {
	
	private String habitat;
	private String name;
	private int age;
	

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


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

		public Cat() {
		super();
	}
		
		public Cat(String habitat, String name, int age) {
			super();
			this.habitat = habitat;
			this.name = name;
			this.age = age;
		}


		@Override
		public String toString() {
			return "Cat [habitat=" + habitat + ", name=" + name + ", age=" + age + "]";
		}


		//makeNoise method
		public String makeNoise() {
			return "Meow!";
		}

}
