package tek.sdet.framework.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

import org.junit.runner.RunWith;




@RunWith(Cucumber.class)	
@CucumberOptions(
	
	tags = "@signUp",
	features = "src/test/resources/featur_copstone",
	glue = "tek.sdet.framework",
	dryRun = false,
	
	plugin = {
			
			"pretty",
			"html:target/Htmlreports/html-report.html",
			"json:target/Jsonreports/Json-report.json"
	},
	
	snippets = CAMELCASE,
	monochrome = true)




public class TestRunner {
	
	

	
	
	
	
	

}



