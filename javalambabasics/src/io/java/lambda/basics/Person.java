package io.java.lambda.basics;



public class Person implements Comparable<Person>  {
	
	
	
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	private String firstName;
	private String lastName;
	private int age;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", getFirstName()="
				+ getFirstName() + ", getLastName()=" + getLastName() + ", getAge()=" + getAge() + "]";
	}
	@Override
	public int compareTo(Person o) {
		
		return o.lastName.compareTo(this.lastName);
		
				
	}
	

}
