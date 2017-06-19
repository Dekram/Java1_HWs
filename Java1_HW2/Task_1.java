package Dekram;

import java.lang.*;
import java.util.*;

/**
 * Created by Dekram on 18.02.17.
 */
public class Task_1 {

    public static void main(String[] args) {

        int[] array = {1, 1, 0, 1, 0, 0, 0, 1, 0, 1};
        System.out.println("Массив 1: " + Arrays.toString(array));
        for (i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        System.out.println("Массив 2: " + Arrays.toString(array));
    }

}
