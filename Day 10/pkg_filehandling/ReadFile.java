package pkg_filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedReader reader = new BufferedReader(new FileReader("MyFile.txt"))){
			String line;
			
			while((line =reader.readLine()) != null) {
				System.out.println(line);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
