package Dekram;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Dekram on 19.02.2017.
 */
public class Task_4 {
    private static final int MAX_TRY_NUMBER = 3;
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);
    private static int numberHidden = 0;
    private static int numberGuessed = 0;

    public static void main(String[] args) {
        numberHidden = random.nextInt(10);
        System.out.println("Отгадайте загаданное целое число от 0 до 9 с трех попыток");
        for (int tryNumber = 0; tryNumber < MAX_TRY_NUMBER; tryNumber++) {
            if (tryToGuessHiddenNumber(tryNumber)) {
                System.out.println("Верно загаданное число " + numberHidden);
                break;
            }
            else if (tryNumber < MAX_TRY_NUMBER - 1) {
                System.out.println("Неверно загаданное число " + (numberHidden < numberGuessed ? "меньше, " : "больше, ") + "чем " + numberGuessed);
            }
            else {
                System.out.println("Вы потратили все попытки, загаданное число " + numberHidden);
            }
        }
        freeResources();
    }

    private static boolean tryToGuessHiddenNumber(int tryNumber) {
        while (true) {
            System.out.println("- Попытка №" + (tryNumber + 1) + ": ");
            if (tryToReadGuessedNumber()) {
                break;
            }
            else {
                System.out.println("[Ошибка] Введите целое число от 0 до 9");
            }
        }
        return numberHidden == numberGuessed;
    }

    private static boolean tryToReadGuessedNumber() {
        scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            numberGuessed = scanner.nextInt();
            if (numberGuessed >= 0 && numberGuessed <= 9) {
                return true;
            }
        }
        return false;
    }

    private static void freeResources() {
        if (scanner != null) {
            scanner.close();
        }
    }

}
