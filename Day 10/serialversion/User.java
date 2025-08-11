package serialversion;
import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;

	
 String username;
 String email;
 int age;

 public User(String username, String email) {
     this.username = username;
     this.email = email;
     this.age = age;
 }

@Override
public String toString() {
	return "User [username=" + username + ", email=" + email + ", age=" + age + "]";
}


}
