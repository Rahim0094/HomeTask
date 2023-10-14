package de.telran.java_home_work;

import java.util.Scanner;

public class TaskJava6_2 {
    public static void main(String[] args) {
       /* Реализуйте программу, которая попросит пользователя ввести три целых числа (используйте сканер)
        . Напишите метод getMax, который принимает эти 3 параметра и возвращает наибольший из них.
        Напечатает максимум из трех чисел.*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 1-ое число :");
        int a = scanner.nextInt();
        System.out.print("Введите 2-ое число :");
        int b = scanner.nextInt();
        System.out.print("Введите 3-ое число :");
        int c = scanner.nextInt();
        int resultgetMax = getMax(a,b,c);
        System.out.println(resultgetMax + " наибольшее число");
    }
    public static int getMax(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else
            return c;
        }

    }

