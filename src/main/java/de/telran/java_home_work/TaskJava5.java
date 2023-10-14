package de.telran.java_home_work;

import java.util.Random;

public class TaskJava5 {
    public static void main(String[] args) {
                   /*  Task 1
        Создать программу, выводящую на экран ближайшее к 10 из двух чисел,
        записанных в переменные m и n.
        Числа могут быть, как целочисленные, так и дробные.

        Например :
        ввод : m=10.5, n=10.45
        вывод: Число 10.45 ближе к 10.*/

        Random random = new Random();
        double myInt = random.nextDouble()+10;
        double volue = myInt;
        String result = String.format("%.2f",volue);
        System.out.println(result);
        double myInt2 = random.nextDouble()+10;
        double volue1 = myInt2;
        String result1 = String.format("%.2f",volue1);
        System.out.println(result1);
        if (myInt > myInt2) {
            System.out.println("1-ое число ты ближе к 10 ");
        } else System.out.println("2-ое число ты ближе к 10");
    }
    }