package testRuns;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = {"stepDefinations","myHooks"},
		monochrome = true,
		dryRun = false
		
		
		)

public class TestRunner1 extends AbstractTestNGCucumberTests{

}
