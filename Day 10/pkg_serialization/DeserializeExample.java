package pkg_serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeExample {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		try(ObjectInputStream in = new ObjectInputStream(new  FileInputStream("student.ser"))){
			Student s = (Student) in.readObject();
			System.out.println("Deserialized Person: " + s.getName() + ", " +s.getAge());
			s.toString();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
