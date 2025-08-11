package pkg_students;

import java.util.ArrayList;

public class Student extends Person implements Registrable  {
	 ArrayList<Course> courses = new ArrayList<>();

	 Student(int id, String name) {
	        super(id, name);
	    }

	@Override
	public void registerCourse(Course c) throws CourseAlreadyRegisteredException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dropCourse() throws CourseNotFoundException {
		// TODO Auto-generated method stub
		
	}

	
		
}
