package RunnerPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		 features = {"src/test/resources/Features/SwagLabs.feature","src/test/resources/Features/LoginSwag.feature"},
		 glue = {"StepDefinition"},
		 tags = {"@Regression"},
		 format = {"pretty","html:Reports/report.html"},
		 dryRun = false,
		 monochrome = false
		 )
public class Run {

}
