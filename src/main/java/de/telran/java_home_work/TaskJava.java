
//Task 1

package de.telran.java_home_work;

public class TaskJava {
    public static void main(String[] args) {

     char myChar = 'G';
     int myint = 89;
     byte myByte = 4;
     short myshort = 56;
     float myfloat = 4.7333436f;
     double myDouble = 4.355453532;
     long myLong = 12121;

     System.out.println("myChar = G");
     System.out.println("myint = 89");
     System.out.println("myByte = 4");
     System.out.println("myshort = 56");
     System.out.println("myfloat = 4.7333436");
     System.out.println("myDouble = 4.355453532");
     System.out.println("myLong = 12121");

     /*
1. В методе main инициализировать все примитивные типы и не примитивные типы.
        2. Вывести их результат в консоль:
        char: G
        int: 89
        byte: 4
        short: 56
        float: 4.7333436
        double: 4.355453532
        long: 12121
*/

   //Task 2

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




