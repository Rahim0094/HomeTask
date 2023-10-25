package de.telran.java_home_work;

import java.util.Arrays;
import java.util.Random;

public class TaskJava8 {
    public static void main(String[] args) {

        /* Создайте массив из 8 случайных целых чисел из интервала [1;50]
        Выведите массив на консоль в строку.
        Замените каждый элемент с нечетным индексом на ноль.
        Снова выведете массив на консоль в отдельной строке.*/

        int[]arr;
        arr = new int[8];
        Random random = new Random();

        for (int i=0; i < arr.length; i++){
            arr[i]= random.nextInt(50);
        }
        System.out.println(Arrays.toString(arr));

        for (int i =0 ; i< arr.length; i++){
            if (arr[i] % 2 == 1){
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
