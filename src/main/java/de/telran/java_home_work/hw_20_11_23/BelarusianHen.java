package de.telran.java_home_work.hw_20_11_23;

public  class BelarusianHen extends Hen{


    @Override
    int getCountOfEggsPerMonth() {
        return 12;
    }

    @Override
    String getDescription() {
        return "Белоруская курица несет "+getCountOfEggsPerMonth()+" яиц в месяц";
    }
}
