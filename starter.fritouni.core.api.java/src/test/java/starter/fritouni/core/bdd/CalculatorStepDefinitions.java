package starter.fritouni.core.bdd;

import static org.assertj.core.api.Assertions.assertThat;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.fritouni.core.bdd.calculator.Calculator;

public class CalculatorStepDefinitions {
	Calculator calculator;
	Integer result;
	
	@Given("I have a calculator")
	public void i_have_a_calculator() {
	    calculator = new Calculator();
	}

	@When("I add {int} and {int}")
	public void i_add_and(Integer a, Integer b) {
	    result = calculator.add(a,b);
	}

	@Then("I chould get {int}")
	public void i_chould_get(Integer excpectedResult) {
	    assertThat(result).isEqualTo(excpectedResult);
	}


}
