package de.telran.java_home_work.hw_17_11_23.toys;

public class Toys implements Boat,Car,Plane,Doll{

    @Override
    public void getSafe() {
        System.out.println("быть безопасной");
    }

    @Override
    public void giveVoiceSignal() {
        System.out.println("подавать голосовой сигнал");

    }

    @Override
    public void fly() {
        System.out.println("летать");

    }

    @Override
    public void radioControlled() {
        System.out.println("быть радиоуправляемой");
    }

    @Override
    public void swim() {
        System.out.println("плавать");
    }
}
    /*Мы делаем игрушки и основные требования для них:
        быть безопасной, быть радиоуправляемой, летать, плавать, подавать голосовой сигнал.
        Для начала выпускаем куклу, самолет, машинку и катер.
        Создать классы данных игрушек для создания объектов на конвеере.
        Требования для них описать интерфейсами…)*/
