package Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/feature/login.feature"},
		glue={"stepdefenition"},
		dryRun = false,
		monochrome=true,
		plugin= {"pretty","html:reports"}
)
public class orange {
		

}
