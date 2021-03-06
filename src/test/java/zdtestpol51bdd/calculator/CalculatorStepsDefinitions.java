package zdtestpol51bdd.calculator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalculatorStepsDefinitions {

    //Calculator - klasa
    //calculator - pole - PUSTE stworzone za pomocą przepisu z klasy Calculator
    Calculator calculator;
    Integer resoult;

    @Given("I have a calculator")
    public void i_have_a_calculator() {
        //utwórz nowy obiekt klasy kalkulator

        calculator = new Calculator();

    }
    @When("I add {int} and {int}")
    public void i_add_and(Integer int1, Integer int2) {
        resoult = calculator.addTwoNumbers(int1, int2);
    }

    @When("I subtract {int} and {int}")
    public void i_subtract_and(Integer int1, Integer int2) {
        calculator.substractTwoNumbers(int1, int2);
        resoult = calculator.substractTwoNumbers(int1, int2);

    }

    @When("I multiple {int} and {int}")
    public void i_multiple_and(Integer int1, Integer int2) {
        resoult = calculator.multipleTwoNumbers(int1, int2);
    }

    @When("I divide {int} by {int}")
    public void i_divide_by(Integer int1, Integer int2) {
        resoult = calculator.divideTwoNumbers(int1, int2);
    }
    @Then("I should get {int}")
    public void i_should_get(Integer int1) {
        Assert.assertEquals(resoult, int1);

    }
}
