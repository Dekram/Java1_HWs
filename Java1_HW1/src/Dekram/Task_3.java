package Dekram;


/**
 * Created by Dekram on 16.02.2017.
 */
public class Task_3 {

	public static void main(String[] args) {
		System.out.println("Sum of 9 and 0 is in range [10..20] : " + isSumInRange10And20(9, 0));
		System.out.println("Sum of 10 and -1 is in range [10..20] : " + isSumInRange10And20(10, -1));
		System.out.println("Sum of 10 and 5 is in range [10..20] : " + isSumInRange10And20(10, 5));
		System.out.println("Sum of 10 and 11 is in range [10..20] : " + isSumInRange10And20(10, 11));
		System.out.println("Sum of 21 and -1 is in range [10..20] : " + isSumInRange10And20(21, -1));
	}
	
	public static boolean isSumInRange10And20(int a, int b) {
		int sum = a + b;
		return sum >= 10 && sum <= 20;
	}

}