package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { ".//Features" }, glue = {
		"com.StepDefinition" }, dryRun = false, monochrome = true,
				//tags = "@TC-02", 
				plugin = { "pretty",
				"html:target/cucumber-reports/htmlreports.html", "json:target/cucumber-reports/jsonreports.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "rerun:target/rerun.text" }
// plugin = {
// "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
)
public class Junit_Runner {

}
