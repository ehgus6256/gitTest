package bit.com.web.di1;

public class Person {
	private String name;
	private int age;
	private double weight;
	private double height;
	
	public void initPerson() {
		System.out.println("initPerson"+this);
	}
	
	public void destroyPerson() {
		System.out.println("destroyPerson");
	}
	
	
	public Person() {
		System.out.println("Person()");
		/* super(); */
	}

	
	

	public Person(String name) {
		super();
		this.name = name;
	}

	public Person(String name, int age, double weight, double height) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
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


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + ", height=" + height + "]";
	}
	
	
	
	
	
	
}
