package day3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarkValidationTest {

	@Test
	void test() {
		MarkValidation mk =new MarkValidation();
		String grade= "Grade A";
		String actual=mk.markGrade(100);
		assertEquals(grade,actual);
	}

}
