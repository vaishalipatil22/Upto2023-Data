package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "@target/rerun.text" }, glue = { "com.StepDefinition" }, plugin = { "pretty",
		"html:target1/cucumber-reports/htmlreports.html", "json:target1/cucumber-reports/jsonreports.json", })

public class Failed_Junit_Runner {

}
