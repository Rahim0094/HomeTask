package de.telran.qa_home_work;

public class TaskQA {
    public static void main(String[] args) {

    int nummer = 345;

    int sum = nummer % 10;
    int sum1 = nummer / 100;
    int sum2 = nummer / 10%10;

    System.out.print(+sum1);
    System.out.print(","+sum2);
    System.out.print(","+sum);


    /* Дано трехзначное число. Вывести на экран все цифры этого числа
        Пример: 345
        Вывод в консоль: Число 345 -> 3, 4, 5*/
    }
}
