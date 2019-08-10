package day2;

public class SumOfNumbers {
	public int sumOfEvenNumbers(int start,int end) {
		int sum=0;
		for(int i=start;i<=end;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
			}
		System.out.println(sum);
		return sum;
	}
	public int sumOfOddNumbers( int start, int end) {
		int sum=0;
		for(int i=start;i<=end;i++) {
			if(i%2!=0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
		return sum;
	}
	/*public static void main(String[] args) {
		SumOfNumbers prg = new SumOfNumbers ();
		prg.sumOfEvenNumbers(1, 10);
		prg.sumOfOddNumbers(1, 10);
	}*/
}
