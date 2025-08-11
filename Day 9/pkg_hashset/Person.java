package pkg_hashset;

import java.util.HashSet;
import java.util.Objects;

public class Person {
	private String name;
	private int age;
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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


//	@Override
//	public int hashCode() {
//		return Objects.hash(age, name);
//	}
//
//
//	   @Override
//	   public boolean equals(Object obj) {
//	       if (this == obj) return true;
//	       if (!(obj instanceof Person)) return false;
//	       Person p = (Person) obj;
//	       return age == p.age && Objects.equals(name, p.name);
//	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  HashSet<Person> people = new HashSet<>();
		  
	       Person p1 = new Person("Harry", 25);
	       Person p2 = new Person("Steven", 30);
	       Person p3 = new Person("Harry", 25); // Same as p1
	 
	      people.add(p1);   // p1 is sharing a different memory loc
	      people.add(p2);
	      people.add(p3); // Will NOT be added (duplicate) // // p3 is sharing a different memory loc
	 
	 
	      System.out.println("People in HashSet:");
	       for (Person p : people) {
	          System.out.println(p.getName() + " - hashCode: " + p.hashCode());
	       }

	}

}
