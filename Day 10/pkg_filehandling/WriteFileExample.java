package pkg_filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try(FileWriter writer = new FileWriter("MyFile.txt")){
			writer.write("Hello,,Java File Handling!");
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
