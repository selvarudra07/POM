package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/features/class2.feature"},
		glue="com.definition",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty"}
				
		)
public class classrunner {

}
