package de.telran.java_home_work.hw_29_11_23.cofe;

import de.telran.java_home_work.hw_17_11_23.pizza.Pizza;

public class CoffeeMachine {
    public static void main(String[] args) {


        Coffee person1 = Coffee.getInstance();
        person1.makeCoffee("latte");

        Coffee person2 = Coffee.getInstance();
        person2.makeCoffee("cappuccino");

        Coffee person3 = Coffee.getInstance();
        person3.makeCoffee("amerikano");

    }


}
    /*У вас на работе есть один кофейный автомат. Он умеет готовить различные виды кофе. Но он только один.
        Реализуйте класс кофейного автомата, с помощью которого любой человек может приготовить себе различные варианты кофе.
        Но что важно, сколько ко бы раз не обращался человек за изготовлением кофе, или какие бы люди не пытались

        приготовить кофе, они всегда получали бы ссылку на один и тот же объект кофейного автомата.
        (Поищите информацию в интернете о паттерне Singleton и попытайтеь его реализовать при решении данной задачи.
        Можно использовать вариант реализации со статическим методом и приватным конструктором,
        или вариант реализации через Enum.)  */