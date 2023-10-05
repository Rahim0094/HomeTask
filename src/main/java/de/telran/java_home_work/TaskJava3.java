package de.telran.java_home_work;

import java.util.Scanner;

public class TaskJava3 {
    public static void main(String[] args) {

                            //Task1
         /*Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
        Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
                Например:
        ввод - mama, papa
        вывод - mapa*/

        Scanner scn = new Scanner(System.in);

        System.out.print("Введите 1 слово : ");
        String soz1 = scn.nextLine();
        System.out.print("Введите 2 слово : ");
        String soz2 = scn.nextLine();

        String str = "Доброе начало!";
        System.out.println(str);

        System.out.println(str.length());

        String sumStr1 = str.substring(0,3);
        System.out.println(sumStr1);

        String sumStr2 = str.substring(10,13);
        System.out.println(sumStr2);
        System.out.println(sumStr1 + sumStr2);

        //Task 2
           /*     Реализовать программу, выводящую на экран результаты:
    Сложения двух чисел
    Вычитания двух чисел
    Умножения двух чисел
    Деления двух чисел
    Каждая из арифметических операций должна быть реализована как отдельный метод.*/

        System.out.print("Введите 1 число : ");
        int arg1 = scn.nextInt();
        System.out.print("Введите 2 число : ");
        int arg2 = scn.nextInt();
        printSum(arg1,arg2);
        printDif(arg1,arg2);
        printMult(arg1,arg2);
        printDiv(arg1,arg2);



    }
    static void printSum(int arg1 ,int arg2) {

       int sum =  arg1 + arg2;
        System.out.println("Сумма=" +sum);

    }
    static void printDif(int arg1 ,int arg2) {

        int sum = arg1 - arg2;
        System.out.println("Разность= " +sum);

    }

    static  void printMult(int arg1 , int arg2) {

        int sum = arg1 * arg2;
        System.out.println("Произведение= " +sum);
    }

    static void printDiv(double arg1 , double arg2){
        double sum = arg1 / arg2;
        System.out.println("Частное= " + sum);
    }
}

