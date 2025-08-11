package pkg_customesort;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {

	public int compare(Student s1, Student s) {
		return Integer.compare(s1.getAge(),s1.getAge());
	}

}
