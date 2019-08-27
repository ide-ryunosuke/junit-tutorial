package junit.tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void multiplyTest1() {
		Calculator calc = new Calculator();
		int expected = 12;
		int actual = calc.multiply(3, 4);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void multiplyTest2() {
		Calculator calc = new Calculator();
		int expected = 12;
		int actual = calc.multiply(4, 5);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void divideTest() {
		Calculator calc = new Calculator();
		int expected = 3;
		int actual = calc.divide(12, 4);
		assertThat(actual, is(expected));
	}

}
