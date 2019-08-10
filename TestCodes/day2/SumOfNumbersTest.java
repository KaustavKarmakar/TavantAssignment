package day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfNumbersTest {

	@Test
	void test() {
		SumOfNumbers sm =new SumOfNumbers();
		int odd=8;
		int result=sm.sumOfOddNumbers(3, 5);
		assertEquals(odd, result);
	}
	
	
	@Test
	void test1() {
		SumOfNumbers sm =new SumOfNumbers();
		int even=6;
		int result=sm.sumOfEvenNumbers(2, 4);
		assertEquals(even, result);
	}

}
