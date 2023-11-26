package de.telran.java_home_work.hw_20_11_23.new_pizza;

import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите форму пиццы (1 - круглая, 2 - квадратная, 3 - прямоугольная): ");
        int сhoice = scanner.nextInt();

        double calories = 0;

        switch (сhoice) {
            case 1:
                System.out.println("Введите радиус круглой пиццы в сантиметрах: ");
                double roundRadius = scanner.nextDouble();
                calories = calculatePizzaCalories(roundRadius);
                break;
            case 2:
                System.out.println("Введите длину стороны квадратной пиццы в сантиметрах: ");
                double squareSide = scanner.nextDouble();
                calories = calculatePizzaCalories(squareSide);
                break;
            case 3:
                System.out.println("Введите длину и ширину прямоугольной пиццы в сантиметрах (через пробел): ");
                double rectangleLength = scanner.nextDouble();
                double rectangleWidth = scanner.nextDouble();
                calories = calculatePizzaCalories(rectangleLength, rectangleWidth);
                break;
            default:
                System.out.println("Некорректный выбор формы пиццы.");
                break;
        }

        System.out.println("Калорийность пиццы: " + calories + " калорий");

    }

    // Метод для круглой пиццы
    private static double calculatePizzaCalories(int radius) {
        int caloriesPerSquareCm = 40;
        double area = Math.PI * Math.pow(radius, 2);
        return area * caloriesPerSquareCm;
    }

    // Метод для квадратной пиццы
    private static double calculatePizzaCalories(double side) {
        int caloriesPerSquareCm = 40;
        double area = Math.pow(side, 2);
        return area * caloriesPerSquareCm;
    }

    // Метод для прямоугольной пиццы
    private static double calculatePizzaCalories(double length, double width) {
        int caloriesPerSquareCm = 40;
        double area = length * width;
        return area * caloriesPerSquareCm;
    }
    }






    /*Вы работаете в пицерии.
        Клиент у Вас может заказать пиццу различных размеров и различных форм: квадратную, прямоугольную, круглую.
        Напишите методы для вычисления калорийности заказанной пиццы, если напримем кв.см. пиццы имеет 40 калорий.
        Попробуйте решить данную задачу через перегрузку методов. */
