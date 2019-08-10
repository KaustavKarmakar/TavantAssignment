package day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void test() {
		int number=24;
		Factorial fact =new Factorial();
		int actual=fact.calculateFactorial(4);
		assertEquals(number,actual);
	}

}
