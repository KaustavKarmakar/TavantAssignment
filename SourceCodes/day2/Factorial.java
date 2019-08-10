package day2;

public class Factorial {
	public int calculateFactorial(int number) {
		int fact=1;
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
		return fact;
	}
	
//	public static void main(String[] args) {
//		Factorial fact =new Factorial();
//		fact.calculateFactorial(6);
//	}
}
