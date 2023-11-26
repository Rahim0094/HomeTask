package de.telran.java_home_work.hw_20_11_23;

public class UkrainianHen extends Hen{

    @Override
    int getCountOfEggsPerMonth() {
        return 14;
    }

    @Override
    String getDescription() {
        return "Украинская курица несет "+getCountOfEggsPerMonth()+" яиц в месяц";
    }
}
