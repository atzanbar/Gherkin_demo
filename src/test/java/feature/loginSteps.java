package feature;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Date;

/**
 * Created by zanbar on 7/13/2017.
 */
public class loginSteps {
    @Given("^user navigates to login page$")
    public void user_navigates_to_login_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //
    }

    @When("^user clicks on the user name textbox and inputs \"([^\"]*)\"$")
    public void user_clicks_on_the_user_name_textbox_and_inputs(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //
    }

    @Then("^user should see \"([^\"]*)\"$")
    public void user_should_see(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assert (false));
        //
    }
}
