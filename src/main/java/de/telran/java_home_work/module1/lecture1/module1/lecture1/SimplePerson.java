package de.telran.java_home_work.module1.lecture1.module1.lecture1;


public class SimplePerson {
    private String fullName;
    private int age;

    public void setFullName(String fullName){
        this.fullName=fullName;
    }
    public  void  setAge(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "SimplePerson{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}
