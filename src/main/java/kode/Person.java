package kode;

public class Person {

	private String name;
	private int age;

	public Person(String name, int age) {
		if (age < 0) {
			throw new IllegalArgumentException("Invalid age");
		}
		this.setName(name);
		this.setAge(age);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("Invalid age");
		}
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.getName();
	}

}
