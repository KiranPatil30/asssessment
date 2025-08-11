package pkg_integration_testing;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
	private File storageFile;


	public File getStorageFile() {
		return storageFile;
	}

	public void setStorageFile(File storageFile) {
		this.storageFile = storageFile;
	}
	
	public void save(User user) throws IOException {

		try (FileWriter writer = new FileWriter(storageFile, true)) {

		writer.write(user.getId() + "," + user.getName() + "\n");

		}

		}
	public List<User> findAll() throws IOException {

		List<User> users = new ArrayList<>();

		if (!storageFile.exists()) return users;


		try (BufferedReader reader = new BufferedReader(new FileReader(storageFile))) {

		String line;

		while ((line = reader.readLine()) != null) {

		String[] parts = line.split(",");

		users.add(new User(parts[0], parts[1]));

		}

		}

		return users;

		}
	
	public void clear() throws IOException {

		new FileWriter(storageFile).close(); 
		}
}
