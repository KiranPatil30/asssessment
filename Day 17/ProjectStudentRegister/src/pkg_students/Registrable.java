package pkg_students;

public interface Registrable {
	public void registerCourse() throws CourseAlreadyRegisteredException;
	public void dropCourse() throws CourseNotFoundException;
}
