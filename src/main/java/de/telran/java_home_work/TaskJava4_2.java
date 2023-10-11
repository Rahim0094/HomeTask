package de.telran.java_home_work;

import java.util.Scanner;

public class TaskJava4_2 {
    public static void main(String[] args) {
        /*Task 3
        Программа запрашивает у пользователя сумму в Евро для конвертации
        Реализовать метод, который конвертирует полученную сумму в сумму в долларах США*/
        Scanner scaner = new Scanner(System.in);
        System.out.println("Сколько Евро вам нужно  для конвертации ? :");
        double summa = scaner.nextInt();
        double summa2 = 1.06;
        double result = summa * summa2;
        System.out.println("Вот сколько получилось :" + result);

    }

}
