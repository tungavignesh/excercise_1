package Com.Gmail.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".\\src\\test\\java\\Com\\Gmail\\Users\\Features\\logintable.feature",
	glue="Com.Gmail.Users.StepDef",
	plugin = {"pretty","html:reportsc/cucumber-reports.html"}
//	tags=("@login and @TC2")
		)
public class TestRunner {

}