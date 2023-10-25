package de.telran.java_home_work;

import java.util.Scanner;

public class TaskJava7 {
    public static void main(String[] args) {
                      // Task 1
         /* Представим, что у нас есть устройство, в котором две колбы.
                Прибор работает корректно, если температура первой колбы выше 100 градусов,
            а температура второй колбы меньше 100 градусов.
                Вы должны написать метод, который проверяет это устройство.
                Ваша программа должна иметь переменные temperature1 и temperature2.
                В результате метод возвращает true или false.*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите градус 1 :");
        int temperature1 = scanner.nextInt();
        System.out.print("Введите градус 2 :");
        int temperature2 = scanner.nextInt();

        if (isTemperatur(temperature1, temperature2)) {
            System.out.println("Прибор работает");
        }else System.out.println("Не соответствует рабочей температуре!");
    }
    public static boolean isTemperatur(int temperature1, int temperature2) {

        return temperature1 > 100 && temperature2 < 100;

    }
}
