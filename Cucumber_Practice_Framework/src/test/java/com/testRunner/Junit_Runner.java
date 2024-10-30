package com.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//Features", glue = "com.stepDefinition",

		dryRun = false, monochrome = true,

		plugin = { "pretty","html:target/cucumber-reports/reports.html" }

)
public class Junit_Runner {

	// empty class

}
