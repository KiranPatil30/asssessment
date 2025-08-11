package pkg_customesort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparable implements Comparable<StudentComparable> {
	private int id;
	private String name;
	
	public StudentComparable(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "StudentComparable [id=" + id + ", name=" + name + "]";
	}


	@Override
	public int compareTo(StudentComparable o) {
		return this.id - o.id;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<StudentComparable> list = new ArrayList<>();
		
		list.add(new StudentComparable(1,"Kiran"));
		list.add(new StudentComparable(22,"Ravi"));
		list.add(new StudentComparable(5,"Abhi"));
		list.add(new StudentComparable(19,"Adarsh"));
		
		Collections.sort(list);
		
		for(StudentComparable l: list)
			System.out.println(l);
		

	}

}

