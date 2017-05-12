package com.sabel.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person>{

	private String name;
	private int alter;
	
	public Person(String name, int alter) {
		super();
		this.name = name;
		this.alter = alter;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + alter;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (alter != other.alter)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public static void main(String[] args) {
		
		List<Person> personen = new ArrayList<>();
		
		Person pers1 = new Person("Hugo", 21);
		Person pers2 = new Person("Karl", 47);
		
		System.out.println(pers1.compareTo(pers2));

		
		personen.add(new Person("Emil", 44));
		personen.add(new Person("Hugo", 33));
		personen.add(new Person("Karl", 22));
		personen.add(new Person("Heinz", 20));
		personen.add(new Person("Heinz", 11));
		personen.add(new Person("Evi", 17));
		personen.add(new Person("Anna", 15));
		personen.add(new Person("Emma", 18));
		
		System.out.println("\nUnsortiert\n");
		
		for (Person person : personen) {
			System.out.print(person.name + "\t");
			System.out.println(person.alter);
		}
		
		System.out.println("\nSortiert\n");
		
		Collections.sort(personen);
		
		for (Person person : personen) {
			System.out.print(person.name + "\t");
			System.out.println(person.alter);
		}
		
	}

	@Override
	public int compareTo(Person o) {
		// return this.alter - o.alter;
		int retval = this.name.compareToIgnoreCase(o.name);
		if (retval == 0) {
			 retval = this.alter - o.alter;
		}
		return retval;
	}
	
	
}
