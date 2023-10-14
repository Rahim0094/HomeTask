package de.telran.java_home_work;

import java.util.Scanner;

public class TaskJava6_1 {
    public static void main(String[] args) {
        /*Реализуйте программу, которая попросит пользователя ввести год и напечатать этот год.
        Метод isLeap проверяет високосный год или нет.*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год для проверки високосный год или нет : ");
        int year = scanner.nextInt();
        if (isLeap(year)){
            System.out.println("год " + year + " високосный");
        }else
            System.out.println("год " + year + " не високосный");


    }
    public  static  boolean isLeap(int year){

        return (year % 4 == 0 && year % 100  != 0) || year % 400 == 0;
    }
}
