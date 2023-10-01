package de.telran.java_home_work;

import java.util.Scanner;

public class TaskJava2 {

    public static void main(String[] args) {

        //Task 1
        /*Создайте строку через new - I study Basic Java!
                Распечатать пред-последний символ строки. Используем метод String.charAt().
                Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
                Вырезать строку Java c помощью метода String.substring().
                Заменить все символы “а” на “о”.
        Преобразуйте строку к верхнему регистру.
                Преобразуйте строку к нижнему регистру.*/

        String str = "I study Basic Java!";

        System.out.println(str.length());

        char synbol = str.charAt(str.length()-2);
        System.out.println(synbol);

        System.out.println(str.contains("Java"));

        String subStr = str.substring(14,18);
        System.out.println(subStr);

        String rep = str.replace('a','o');
        System.out.println(rep);

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());


        //Task 2
       /* Создайте методы с математическими операциями +, -, *, /
        Каждый метод принимает два числа в параметрах и возвращает результат
        Вызовите все методы в main
        Результат распечатайте в консоль*/

        Scanner scn = new Scanner(System.in);

        System.out.println("Введите 1 число : ");
        float num1 = scn.nextFloat();

        System.out.println("Введите 2 число : ");
        float num2 = scn.nextFloat();

        float res1 = num1 + num2;
        float res2 = num1 - num2;
        float res3 = num1 * num2;
        float res4 = num1 / num2;

        System.out.println("Результат : ");
        System.out.println(res1 + "\n" +res2 + "\n" + res3 + "\n"+ res4);
    }
    }


