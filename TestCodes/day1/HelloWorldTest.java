package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	void test() {
		HelloWorld hello =new HelloWorld();
		String actual=hello.getMessage("Hello ");
		assertEquals("Hello World",actual);
	}

}
