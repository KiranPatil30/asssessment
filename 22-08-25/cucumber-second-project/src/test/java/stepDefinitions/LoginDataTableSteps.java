package stepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class LoginDataTableSteps {
	   @Given("the following users attempt to login:")
	   public void the_following_users_attempt_to_login(DataTable dataTable) {
	       // Convert data table to List of Maps
	      List<Map<String, String>> users = dataTable.asMaps(String.class, String.class);
	 
	       for (Map<String, String> user : users) {
	           String username = user.get("username");
	           String password = user.get("password");
	 
	           boolean result = authenticate(username, password);
	 
	          System.out.println("Login attempt for user: " + username +
	                  " with password: " + password +
	                  " => " + (result ? "SUCCESS" : "FAILURE"));
	       }
	   }
	 
	   // Simulated login function
	   private boolean authenticate(String username, String password) {
	       // Simulate a database of valid credentials
	       return (username.equals("user1") && password.equals("pass1")) ||
	             (username.equals("user2") && password.equals("pass2"));
	   }
}
