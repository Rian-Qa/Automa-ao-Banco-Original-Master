package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature", glue = "Steps", tags = "@pj", plugin = { "pretty",
		"html:target/flashcode.html" }, monochrome = true, dryRun = true)//dryrun tem que esta false

public class Runner {

}
