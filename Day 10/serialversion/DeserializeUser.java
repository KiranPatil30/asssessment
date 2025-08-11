package serialversion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeUser {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("user.ser"));
            User user = (User) in.readObject();
            in.close();
            System.out.println("Deserialized: " + user);
      
	}

}
