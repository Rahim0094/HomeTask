package de.telran.java_home_work.hw_17_11_23.pizza;

public class Pizza implements Cashier,Cleaner,Cook,Waiter{

    @Override
    public void issuesAnInvoice() {
        System.out.println("выставляет счет");
    }

    @Override
    public void acceptsPayment() {
        System.out.println("принимает оплату");

    }

    @Override
    public void cleansTheTable() {
        System.out.println("убирает стол");

    }

    @Override
    public void preparesTheOrder() {
        System.out.println("готовит заказ");
    }

    @Override
    public void acceptsOrder() {
        System.out.println("принимает заказ");
    }

    @Override
    public void takesOutTheOrder() {
        System.out.println("выносит заказ");
    }

    @Override
    public void isWashingDishes() {
        System.out.println("моет посуду");
    }
}
   /* У нас есть пиццерия. В ней работает несколько человек.
        Кассир -  выставляет счет, принимает оплату.
        Официант - принимает заказ, выносит заказ, принимает оплату, убирает стол.
        Повар - готовит заказ, выносит заказ и моет посуду (очень редко).
        Уборщик - убирает стол, моет посуду.
        Реализовать класс процесса работы пиццерии с разделением обязанностей по вышеуказанному поведению. */