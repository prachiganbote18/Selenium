package CucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
// to run cucumber project, its mandatory to execution
@CucumberOptions(features = "Feature", glue = "stepDefinition", tags = "@Gmail")
public class TestRunner {

}
