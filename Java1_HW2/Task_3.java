package Dekram;

import java.lang.*;

/**
 * Created by Dekram on 19.02.2017.
 */
public class Task_3 {

    public static void main(String[] args) {

        int[] array = {1, 5, 25, 6, 7, 11, 15, 25, 9, 19, 16, 6, 5, 11, 18, 10, 4, 1, 8, 13};
        System.out.println("Массив: " + Arrays.toString(array));
        int max = array.length > 0 ? array[0] : 0;
        int min = array.length > 0 ? array[0] : 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальное значение массива = " + max);
        System.out.println("Минимальное значение массива = " + min);

    }

}
