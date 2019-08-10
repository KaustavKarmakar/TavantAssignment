package day3;

public class MarkValidation {
	public String markGrade(int number) {
		String Grade="";
		int mark=number/15;
		switch(mark) {
		case 6:Grade="Grade A";
		break;					
		case 5:Grade="Grade B";
		break;	
		case 4:Grade="Grade C";
		break;
		case 3:Grade="Grade D";
		break;
		default:Grade="Fail";
		
		}
		System.out.println(Grade);
		return Grade;
	}
//	public static void main(String[] args) {
//		MarkValidation mk =new MarkValidation();
//		mk.markGrade(32);
//	}
}
