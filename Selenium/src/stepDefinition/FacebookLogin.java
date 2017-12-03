package stepDefinition;

import CucumberTest.WebUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookLogin {

FacebookLogin fb=new FacebookLogin();
	
@Given("^open URL\"([^\"]*)\"$")
public void open_URL(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    WebUtils.driver.get("URL");
}

@Given("^Username \"([^\"]*)\"$")
public void username(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}

@Given("^password \"([^\"]*)\"$")
public void password(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}

@When("^Click on \"([^\"]*)\"$")
public void click_on(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("^validate error\"([^\"]*)\" message$")
public void validate_error_message(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}

}
