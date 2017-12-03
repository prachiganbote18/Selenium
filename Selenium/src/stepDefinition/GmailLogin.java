package stepDefinition;

import junit.framework.Assert;
import CucumberTest.WebUtils;
import WebPages.GmailLoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GmailLogin {
	GmailLoginPage g1=new GmailLoginPage();
	@Given("^Open the gmail application with URL \"([^\"]*)\"$")
	public void open_the_gmail_application_with_URL(String url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   WebUtils.driver.get(url);
	}

	@Given("^Enter username=\"([^\"]*)\"$")
	public void enter_username(String username) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    g1.Enter_Username(username);
	}

	@When("^click on \"([^\"]*)\"button$")
	public void click_on_button(String Nxtbtn) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    g1.nxtclick();
	}

	@Given("^Enter password=\"([^\"]*)\"$")
	public void enter_password(String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   g1.Enter_Password(password);
	}

	@When("^click on \"([^\"]*)\" button$")
	public void click_on_button1(String Nxtbtn) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    g1.nxtclick();
	}

	@Then("^System should show error message \"([^\"]*)\"$")
	public void system_should_show_error_message(String msg) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // g1.Show_msg(msg);
	    Assert.assertEquals(msg, g1.Show_msg());
	}

}
