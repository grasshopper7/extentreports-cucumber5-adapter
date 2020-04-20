package cucumber.examples.java.calculator;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }/* , strict=true */)
//@Category(Example.class)
public class RunCukesTest  extends AbstractTestNGCucumberTests {

}
