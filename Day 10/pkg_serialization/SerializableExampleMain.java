package pkg_serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableExampleMain {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Student s1 =  new Student("Brian",20);
		
		 try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
			 out.writeObject(s1);
			 System.out.println("Object serialized to student.ser");
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
				
		 

	}

}
