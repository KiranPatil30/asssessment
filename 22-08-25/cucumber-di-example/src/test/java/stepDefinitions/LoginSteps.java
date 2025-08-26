package stepDefinitions;

import static org.junit.Assert.assertFalse;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.LoginService;

public class LoginSteps {

    private final LoginService loginService;

    public LoginSteps(LoginService loginService) {
        this.loginService = loginService;
    }

    @Given("the user enters username {string} and password {string}")
    public void the_user_enters_username_and_password(String username, String password) {
        loginService.setCredentials(username, password);
    }

//    @When("the user logs in")
//    public void the_user_logs_in() {
//        loginService.login();
//    }

//    @Then("the user should be logged in successfully")
//    public void the_user_should_be_logged_in_successfully() {
//        assertTrue(loginService.isLoggedIn());
//    }
    @Then("the user should not be logged in")
    public void the_user_should_not_be_logged_in() {
        assertFalse(loginService.isLoggedIn());
    }

}
