package day3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureTest {

	@Test
	void test() {
		Temperature temp =new Temperature();
		double celsius=18.055559999999996;
		double actual=temp.convertToCelsius(64.500008);
		assertEquals(celsius,actual);
	}


	@Test
	void test1() {
		Temperature temp =new Temperature();
		double farenhiet= 64.500008;
		double actual=temp.convertToFarenheit(18.055559999999996);
		assertEquals(farenhiet,actual);
	}
}
