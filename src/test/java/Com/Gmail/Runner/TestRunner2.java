package Com.Gmail.Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features=".\\src\\test\\java\\Com\\Gmail\\Users\\Features\\logintable.feature",
		glue="Com.Gmail.Users.StepDef",
		plugin = {"pretty","html:reportsc/cucumber-reports.html"})
public class TestRunner2 extends AbstractTestNGCucumberTests{
			
		}

