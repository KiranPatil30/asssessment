package stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.User;

public class UserSteps {
	 private List<User> users;

	    @Given("the following user data:")
	    public void the_following_user_data(DataTable table) {
	        List<Map<String, String>> rows = table.asMaps(String.class, String.class);

	        users = rows.stream()
	                .map(row -> new User(
	                        row.get("name"),
	                        Integer.parseInt(row.get("age")),
	                        row.get("email")
	                ))
	                .collect(Collectors.toList());
	    }

	    @When("I process the user data")
	    public void i_process_the_user_data() {
	        users.forEach(user -> System.out.println("User: " + user));
	    }

	    @Then("I should have {int} users")
	    public void i_should_have_users(Integer expectedCount) {
	        assertEquals(expectedCount.intValue(), users.size());
	    }

	    @Then("all emails should contain \"@\"")
	    public void all_emails_should_contain_at() {
	        for (User user : users) {
	            assertTrue("Email missing '@': " + user.getEmail(), user.getEmail().contains("@"));
	        }
	    }
}
