package latihan.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( 
features = {"src/test/resources/pagefactory/001Login.feature"},
glue = "latihan.cucumber.runner",
monochrome=true,
plugin = {"pretty","html:target/hrms/htmlreport/LoginRunner.html",
		"json:target/hrms/jsonreport/LoginRunner.json",
		"junit:target/hrms/junitreport/LoginRunner.xml"})
public class LoginRunner extends AbstractTestNGCucumberTests{}