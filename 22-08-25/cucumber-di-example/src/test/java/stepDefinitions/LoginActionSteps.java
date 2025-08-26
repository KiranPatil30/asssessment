package stepDefinitions;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import services.LoginService;

public class LoginActionSteps {

    private final LoginService loginService;

    public LoginActionSteps(LoginService loginService) {
        this.loginService = loginService;
    }

    @When("the user logs in")
    public void the_user_logs_in() {
        loginService.login();
    }

    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {
        assertTrue(loginService.isLoggedIn());
    }
}
