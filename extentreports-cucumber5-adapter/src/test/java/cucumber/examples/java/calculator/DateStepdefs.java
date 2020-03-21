package cucumber.examples.java.calculator;

import static org.testng.Assert.assertEquals;

import java.util.Date;

import io.cucumber.java.en.*;


public class DateStepdefs {
    private String result;
    private DateCalculator calculator;

    @Given("today is {iso-date}")
    public void today_is(Date date) {
        calculator = new DateCalculator(date);
    }

    @When("I ask if {date} is in the past")
    public void I_ask_if_date_is_in_the_past(Date date) {
        result = calculator.isDateInThePast(date);
    }

    @Then("the result should be {string}")
    public void the_result_should_be(String expectedResult) {
        assertEquals(expectedResult, result);
    }
}
