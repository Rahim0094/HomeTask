package de.telran.java_home_work.hw_17_11_23.Messenger;

public class App implements Messenger {


    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }

    @Override
    public String getMessage() {
        return null;
    }
}



    /*Есть интерфейс Messenger с
    void sendMessage(String message);
    String getMessage();
   Реализуйте 3 класса: Viber, Telegramm и WhatsApp,
           которые умеют выполнять эти действия.*/