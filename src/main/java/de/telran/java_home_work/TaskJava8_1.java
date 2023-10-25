package de.telran.java_home_work;

import java.util.Random;

public class TaskJava8_1 {
    public static void main(String[] args) {
/*Создайте массив из 5 случайных целых чисел из интервала [10;99]
        Выведите его на консоль в строку.
        Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.*/

        int[] arr;
        arr = new int[5];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(99 - 10) + 10;
            System.out.println(arr[i]);
        }


        System.out.println(getArrayIncreases(arr));
    }

    public static boolean getArrayIncreases(int[] arr) {

        boolean result = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
    }

