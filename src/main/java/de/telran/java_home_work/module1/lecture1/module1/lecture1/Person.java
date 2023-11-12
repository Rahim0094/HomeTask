package de.telran.java_home_work.module1.lecture1.module1.lecture1;

public class Person {
    public static void main(String[] args) {

                      // 1 Variant
        System.out.println(move(""));
        System.out.println(talk(""));

        SimplePerson person0 = new SimplePerson();
        System.out.println(person0);

        SimplePerson person = new SimplePerson();
        person.setFullName("Rahim");
        person.setAge(30);
        System.out.println(person);

                      // 2 Variant    Какой мотод более верный ?
        Human human = new Human();
        human.fullName = "Roma";
        human.age = 25;
        human.move();
        human.talk();

    }
    static String move(String walk) {
        walk = "Такой-то  module1.lecture1.module1.lecture1.Person ходит";
        return walk;
    }
    static String talk(String message) {
        message = "  module1.lecture1.module1.lecture1.Person говорит";
        return message;
    }

}

                            // 2 Variant
class Human{
    String fullName;
    int age;
    void move(){
        System.out.println("Такой-то "+fullName+" ходит "+age+" лет.");
    }
    void talk(){
        System.out.println("Такой-то "+fullName+" говорит "+age+" лет.");
    }
}

           /*Создать класс module1.lecture1.module1.lecture1.Person, который содержит:
        переменные fullName, age;
        методы move() и talk(), в которых просто вывести на консоль сообщение -
        "Такой-то  module1.lecture1.module1.lecture1.Person говорит".
        Добавьте два конструктора  - module1.lecture1.module1.lecture1.Person() 
        и module1.lecture1.module1.lecture1.Person(fullName, age).
        Создайте два объекта этого класса. Один объект инициализируется конструктором module1.lecture1.module1.lecture1.Person(), 
        другой - module1.lecture1.module1.lecture1.Person(fullName, age)*/