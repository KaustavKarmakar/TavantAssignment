package day3;

public class Temperature {
	public double convertToFarenheit(Double celsius) {
		double farenheit=  celsius * (9f / 5) + 32;
		System.out.println(farenheit);
		return farenheit;
	}
	public double convertToCelsius (Double farenheit) {
		double celsius=((farenheit - 32)*5)/9;
		System.out.println(celsius);
		return celsius;
	}
//	public static void main(String[] args) {
//		Temperature temp = new Temperature();
//		temp.convertToFarenheit(63.5);
//		temp.convertToCelsius(63.5);
//	}
}
