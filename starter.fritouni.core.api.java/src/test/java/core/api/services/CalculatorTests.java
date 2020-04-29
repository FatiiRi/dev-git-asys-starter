package core.api.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CalculatorTests {
	
	
	@Test
	public void addTest() {
		long addResult = Calculator.add(2, 3);
		assertThat(addResult == (long)5);
	}
	
	@Test
	public void minusTest() {
		long minusResult = Calculator.minus(10, 4);
		assertEquals( 6, minusResult);
	}
	
	@Test
	public void multipleTest() {
		long multipileResult = Calculator.multiple(11, 2);
		assertEquals(22, multipileResult);
	}

}
