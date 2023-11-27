package de.telran.java_home_work.hw_29_11_23.cofe;

public class Coffee {
    private static  Coffee instance;
    private Coffee(){
    }
    public void makeCoffee(String type){
        System.out.println(type+" Priqotovlina v ofisnom coffee varke");
    }

    public static Coffee getInstance(){
        if (instance == null){
            instance = new Coffee();
        }
        return instance;
    }
}
