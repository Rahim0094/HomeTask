package de.telran.java_home_work.hw_29_11_23;

public enum Season {
    JANUARY("январь"),
    FEBRUARY("февраль"),
    MARCH("март"),
    APRIL("апрель"),
    MAY("май"),
    JUNE("июнь"),
    JULY("июль"),
    AUGUST("август"),
    SEPTEMBER("сентябрь"),
    OCTOBER("октябрь"),
    NOVEMBER("ноябрь"),
    DECEMBER("декабрь");


    private String translate;

    Season(String translate){
        this.translate = translate;
    }
    public String toString(){
        return "Перевод на русский язык "+translate;
    }
}
