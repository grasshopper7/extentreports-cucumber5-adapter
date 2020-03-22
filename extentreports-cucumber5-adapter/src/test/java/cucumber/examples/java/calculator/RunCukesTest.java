package cucumber.examples.java.calculator;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
//@Category(Example.class)
public class RunCukesTest /* extends AbstractTestNGCucumberTests */{

}
