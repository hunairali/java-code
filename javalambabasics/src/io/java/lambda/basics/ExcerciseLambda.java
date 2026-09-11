package io.java.lambda.basics;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExcerciseLambda {

	public static void main(String[] args) {
		
		List<Person> persons = Arrays.asList(
			    new Person("John", "Doe", 20),
			    new Person("Jane", "Smith", 25),
			    new Person("Michael", "Johnson", 30),
			    new Person("Emily", "Brown", 22),
			    new Person("David", "Wilson", 28)
			);
		
		Collections.sort(persons, (p1,p2)->p1.getLastName().compareTo(p2.getLastName()));
		

		
		printAll(persons);

		
		
		printwihtLetterC(persons);

	}

	private static void printwihtLetterC(List<Person> persons) {
	
			for(Person p:persons) {
			 if(p.getLastName().startsWith("W")) {
				 
					System.out.println(p);

			 }
				
		}
		
	}

	private static void printAll(List<Person> persons) {
		
		

		for(Person p:persons) {
			
			System.out.println(p);
		}
		
	}

}

