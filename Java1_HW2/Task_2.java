package Dekram;

import java.util.Arrays;

/**
 * Created by Dekram on 19.02.17.
 */
public class Task_2 {

    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 0, j = 1; i < array.length; i++, j += 3) {
            array[i] = j;
        }
        System.out.println("Массив: " + Arrays.toString(array));

    }

}
