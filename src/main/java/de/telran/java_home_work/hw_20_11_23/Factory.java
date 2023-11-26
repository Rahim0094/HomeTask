package de.telran.java_home_work.hw_20_11_23;

public class Factory {
    public static void main(String[] args) {

        Hen russianHen = HenFactory.getHen("russia");
        System.out.println(russianHen.getDescription());
        Hen belarusianHen  = HenFactory.getHen("belarusia");
        System.out.println(belarusianHen.getDescription());
        Hen moldavianHen = HenFactory.getHen("moldova");
        System.out.println(moldavianHen.getDescription());
        Hen ukrainianHen = HenFactory.getHen("ukraina");
        System.out.println(ukrainianHen.getDescription());

    }
}
