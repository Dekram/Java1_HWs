package Dekram;


/**
 * Created by Dekram on 15.02.2017.
 */
public class Task_2 {

	public static void main(String[] args) {
		System.out.println("3 * (3 + (5 / 1)) = " + count(3, 3, 5.0f, 1));
		System.out.println("3 * (3 + (5 / -2)) = " + count(3, 3, 5.0f, -2));
		System.out.println("3 * (3 + (5 / 0)) = " + count(3, 3, 5.0f, 0));
	}
	
	public static float count(int a, int b, float c, int d) {
		if (d == 0) {
			return 0;
		}
		return a * (b + (c / d));
	}
	
}
