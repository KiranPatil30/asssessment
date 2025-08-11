package pkg_filehandling;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("MyFile.txt");
		
		if(file.delete()) {
			System.out.println("File is Deleted!"+file.getName());
		}else
		{
			System.out.println("Failed to delete the file");
		}
	
	}

}
