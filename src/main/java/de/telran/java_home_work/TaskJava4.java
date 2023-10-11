package de.telran.java_home_work;

import java.util.Scanner;

public class TaskJava4 {
    public static void main(String[] args) {
        /*Task 1
        Переведите число 333 из 16-ричной в 10-ричную
        Переведите число 819 из 10-ричной в 16-ричную
        101101 в двоичной, переведите в 10-ричную
        124 в десятичной, переведите в 2-ичную*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("В какой системе счисления ваше число: ");
        int base = scanner.nextInt();
        System.out.println("Введите число: ");
        int num = scanner.nextInt(base);

        System.out.println(num);
        System.out.println(Integer.toBinaryString(num));
        System.out.println(Integer.toOctalString(num));
        System.out.println(Integer.toHexString(num));

    }



}

