package de.telran.java_home_work;

public class SimplePhone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.model = "Iphone";
        phone.weight = 150;
        phone.number = 555555;
        phone.name = "Roma";
        phone.receiveCall();
        phone.getNumber();
        System.out.println("Telefon "+phone.model+", вес "+phone.weight+", номер "+phone.number);

        Phone phone1 = new Phone();
        phone1.model = "Samsung";
        phone1.weight = 170;
        phone1.number = 444444;
        phone1.name = "Sasha";
        phone1.receiveCall();
        phone1.getNumber();
        System.out.println("Telefon "+phone1.model+", вес "+phone1.weight+", номер "+phone1.number);

        Phone phone2 = new Phone();
        phone2.model = "Xiaomi";
        phone2.weight = 160;
        phone2.number = 3333333;
        phone2.name = "Dima";
        phone2.receiveCall();
        phone2.getNumber();
        System.out.println("Telefon "+phone2.model+", вес "+phone2.weight+", номер "+phone2.number);




    }
    static class Phone{
        int number;
        int weight;
        String model;
        String name;
        void receiveCall(){
            System.out.println("Звонит "+name);
        }
        void getNumber(){
            System.out.println("номер телефона "+number);
        }
    }

    }

    /*Класс Phone.
        Создайте класс Phone, который содержит переменные number, model и weight.
        Создайте три экземпляра этого класса.
        Выведите на консоль значения их переменных.
        Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
        Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
        Вызвать эти методы для каждого из объектов.*/