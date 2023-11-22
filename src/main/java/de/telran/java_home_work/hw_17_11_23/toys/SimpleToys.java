package de.telran.java_home_work.hw_17_11_23.toys;

public class SimpleToys {
    public static void main(String[] args) {
        Toys toys = new Toys();

        Boat boat = toys;
        boat.getSafe();
        boat.swim();

        Car car = toys;
        car.getSafe();
        car.radioControlled();

        Plane plane = toys;
        plane.getSafe();
        plane.fly();

        Doll doll = toys;
        doll.getSafe();
        doll.giveVoiceSignal();
    }
}
