
  package day1;
  
  import static org.junit.jupiter.api.Assertions.*;
  
  import org.junit.jupiter.api.Test;
  
  class MarkValidatorTest {
  
  
	
	  @Test void testPass() { MarkValidator mk =new MarkValidator(); String
	  pass="Pass"; String mark=mk.isPass(66); assertEquals(pass,mark);
	  
	  }
	  
	  @Test void testFail() { MarkValidator mk =new MarkValidator(); String
	  fail="Fail"; String mark=mk.isPass(10); assertEquals(fail,mark);
	  
	  }
	 
  
  @Test void testGrade1() { MarkValidator mk = new MarkValidator(); String
  grade = "Grade A"; String mark = mk.markGrade(100); assertEquals(grade,
  mark);
  
  }
  
  }
 