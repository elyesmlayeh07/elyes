package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="src/test/resources/feature/login.feature",
		glue="testsuit",
		plugin= {"pretty","html:target/cucumber-report.html"}
		) 


public class Runner {

}
