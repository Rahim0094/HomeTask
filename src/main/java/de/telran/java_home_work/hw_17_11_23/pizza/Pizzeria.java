package de.telran.java_home_work.hw_17_11_23.pizza;

public class Pizzeria {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();

        Cook cook = pizza;
        cook.isWashingDishes();
        cook.preparesTheOrder();
        cook.takesOutTheOrder();

        Cashier cashier = pizza;
        cashier.acceptsPayment();
        cashier.issuesAnInvoice();

        Cleaner cleaner = pizza;
        cleaner.cleansTheTable();
        cleaner.isWashingDishes();

        Waiter waiter = pizza;
        waiter.acceptsOrder();
        waiter.acceptsPayment();
        waiter.cleansTheTable();
        waiter.takesOutTheOrder();
    }
}
