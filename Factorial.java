package week2.day2;

public class Factorial {

	public static void main(String[] args) {
		
		int num = 6;
		int tmp = 1;
		
		for (int i = num; i >=1; i--) {
			tmp = tmp * i;
			
		}
		System.out.println("Factorial value :" + tmp);
	}
}
