package stepDefinition.ops;

import junit.framework.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class OperationStepDef {
	int c;

	@Given("^user add two numbers \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_add_two_numbers_and(int arg1, int arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		c = arg1 + arg2;
	}

	@Then("^Addition should be \"([^\"]*)\"$")
	public void addition1(int sum) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(c == sum);
	}

	@Then("^Addition should not be \"([^\"]*)\"$")
	public void addition_should_not_be(int sum) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertFalse(c == sum);
	}

	@Given("^user wants to do  addition of  two numbers (\\d+) and (\\d+)$")
	public void user_wants_to_do_addition_of_two_numbers_and(int arg1, int arg2)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		c = arg1 + arg2;
	}

	@Then("^Addition should be (\\d+)$")
	public void addition_should_be(int sum) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(c == sum);
	}

}
