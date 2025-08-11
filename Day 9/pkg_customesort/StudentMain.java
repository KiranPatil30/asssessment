package pkg_customesort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("Kiran",29));
		list.add(new Student("Ravi",23));
		list.add(new Student("Abhi",30));
		
		System.out.println("Before Sorting: ");
		for(Student s:list) {
			System.out.println(""+s);
		}
		
		Collections.sort(list,new AgeComparator());
		
		System.out.println("After Sorting by Age: ");
		for(Student s:list) {
			System.out.println(""+s);
		}
		
		Collections.sort(list,new NameComaparator());
		
		System.out.println("After Sorting by Name: ");
		for(Student s:list) {
			System.out.println(""+s);
		}
		
		// APpploch 2nd using anayanous class
		Collections.sort(list,new Comparator<Student>(){
			public int compare(Student s1, Student s2) {
				return s2.getName().compareTo(s1.getName());
			}
		});
		System.out.println(" Sorting by another second approch by name: ");
		for(Student s:list) {
			System.out.println(""+s);
		}
		
		System.out.println("Sorting by another third approch by lamda expression:");
		list.sort((s1,s2)-> Integer.compare(s1.getAge(), s2.getAge()));
		for(Student s:list) {
			System.out.println(""+s);
		}
		
		
		// To iterate the elements of the ArrayList
		System.out.println("By using iterae:");
		list.forEach(System.out::println);
		

	}

}
