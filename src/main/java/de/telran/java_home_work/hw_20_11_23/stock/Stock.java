package de.telran.java_home_work.hw_20_11_23.stock;

public class Stock implements Storekeeper,Loader,Collector{


    @Override
    public void placesGoodsWarehouse() {
        System.out.println("Размещает товар на складе");
    }

    @Override
    public void collectsGoodsFromWarehouse() {
        System.out.println("Собирает товар на складе");
    }

    @Override
    public void unloadsGoods() {
        System.out.println("Разгружает товар");
    }

    @Override
    public void loadsProduct() {
        System.out.println("Загружает товар");
    }

    @Override
    public void acceptsGoods() {
        System.out.println("Принимает товар");
    }

    @Override
    public void releasesTheGoods() {
        System.out.println("oтпускает товар");
    }

    @Override
    public void definesPlace() {
        System.out.println("Определяет место (ячейку) для хранения товара");
    }

    @Override
    public void generatesTask() {
        System.out.println("Формирует задание на сборку товара со склада");
    }

    @Override
    public void generatesTaskForPlacingGoodsWarehouse() {
        System.out.println("Формирует задание на размещение товара на складе");
    }
}




    /*Вы работаете на складе.
        Когда приезжает товар, у вас:
        Грузчик: Разгружает товар, Загружает товар.
        Кладовщик: Принимает товар, отпускает товар, Определяет место (ячейку) для хранения товара,
        Формирует задание на сборку товара со склада, Формирует задание на размещение товара на складе.
        Сборщик: Размещает товар на складе, Собирает товар на складе.
        Реализовать складскую работу на складе, согласно вышеуказанного поведения. */