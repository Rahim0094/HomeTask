package de.telran.java_home_work.hw_20_11_23;

public class RussianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 8;
    }

    @Override
    String getDescription() {
        return "Русская курица несет "+getCountOfEggsPerMonth()+" яиц в месяц";
    }
}
