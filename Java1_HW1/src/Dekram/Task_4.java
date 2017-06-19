package Dekram;


/**
 * Created by Dekram on 16.02.2017.
 */
public class Task_4 {

	public static void main(String[] args) {
		System.out.println("Year 0 is leap : " + isYearLeap(0));
		System.out.println("Year 1 is leap : " + isYearLeap(1));
		System.out.println("Year 4 is leap : " + isYearLeap(4));
		System.out.println("Year 100 is leap : " + isYearLeap(100));
		System.out.println("Year 101 is leap : " + isYearLeap(101));
		System.out.println("Year 104 is leap : " + isYearLeap(104));
		System.out.println("Year 200 is leap : " + isYearLeap(200));
		System.out.println("Year 400 is leap : " + isYearLeap(400));
		System.out.println("Year 401 is leap : " + isYearLeap(401));
		System.out.println("Year 404 is leap : " + isYearLeap(404));
		System.out.println("Year 500 is leap : " + isYearLeap(500));
	}

	public static boolean isYearLeap(int year) {
		return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
	}
	
}