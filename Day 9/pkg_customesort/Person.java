package pkg_customesort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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
	

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> person = Arrays.asList(
				new Person("Brian",30),
				new Person("Harry",10),
				new Person("Brian",40)
				);
		
		System.out.println("Original List: ");
		System.out.println(person);
		
		person.sort(Comparator.comparing((Person p)-> p.getName()).thenComparing(p -> p.getAge()));
		System.out.println("Sorted by name then by ages;");
		
		for(Person p :person) {
			System.out.println(""+p);
		}
		
	}

}
