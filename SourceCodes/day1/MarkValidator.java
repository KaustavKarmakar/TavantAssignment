package day1;

public class MarkValidator {
	public String isPass(int mark) {
		String result;
		if(mark >= 33) {	
			System.out.println("Pass");
			result="Pass";
		}
		else {
			System.out.println("fail");
			result="Fail";	
		}
		return result;
		
	}
	public String markGrade(int mark) {
		String result;
		if (mark >= 90) {
			System.out.println("Grade A");
			result="Grade A";
		}
		else if(mark >= 75 && mark < 90) {
			System.out.println("Grade B");
			result="Grade B";
		}
		else if(mark >= 60 && mark < 75) {
			System.out.println("Grade C");
			result="Grade C";
		}
		else {
			System.out.println("Grade D");
			result="Grade D";
		}
		return result;
	}
	/*public static void main(String[] args) {
		MarkValidator prg =new MarkValidator();
		prg.isPass(45);
		prg.markGrade(45);
	}*/
}
