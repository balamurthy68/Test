package TestRunners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Features/Search.feature",
		glue={"StepDefs"},
		plugin = {"pretty", "html:target/cucumber/report.html","json:target/json/report.json","junit:target/XML/XMLREPORT.xml",
			"com.cucumber.listener.ExtentCucumberFormatter:target/extent/cucumberreport.html"},
		tags = {"@SmokeTests"},
		monochrome=true
			)
public class TestRunner {
	
	@AfterClass
	public static void writeExtentReport() {
	
		Reporter.loadXMLConfig("C:\\Users\\User\\git\\CucumberInfyExtentReport//CucumberInfyExtentReport//src//test//resources/extent-config.xml");
	
	}
	
	
}
