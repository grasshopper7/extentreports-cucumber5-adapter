package cucumber.examples.java.calculator;

import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", 
		"json:target/cucumber-report.json"})
@Category(Example.class)
public class RunCukesTest {

}
