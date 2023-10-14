package de.telran.java_home_work;

public class TaskJava6 {
    public static void main(String[] args) {

        /* Создайте две переменные isEdekaOpen и isReweOpen,
        значения которых зависят от того, открыты магазины или нет.
                Реализует логический метод canBuy,  возвращающий boolean
        Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
                Отобразите строку «Я могу купить еду, это ……» и значение.*/

        boolean isEdekaOpen = true;
        boolean isReweOpen  = false;
        System.out.println(canBuy(isReweOpen,isEdekaOpen) ? "Я могу купить еду " : "Магазины закрыты");

    }

    private static boolean canBuy(boolean a, boolean b ){

        return a || b;

    }
}
