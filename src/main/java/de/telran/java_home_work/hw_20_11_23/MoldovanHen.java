package de.telran.java_home_work.hw_20_11_23;

public class MoldovanHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 10;
    }

    @Override
    String getDescription() {
        return "Молдовская курица несет "+getCountOfEggsPerMonth()+" яиц в месяц";
    }
}
