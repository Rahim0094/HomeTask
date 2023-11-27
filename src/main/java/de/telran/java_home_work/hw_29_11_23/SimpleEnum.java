package de.telran.java_home_work.hw_29_11_23;

public class SimpleEnum {
    public static void main(String[] args) {
        Season season = Season.MAY;
        System.out.println(season);


        switch (season){
            case JANUARY:
                System.out.println("Sezon Zima . Kuwayte mnoqo qoracix blud");
                break;
            case FEBRUARY:
                System.out.println("Sezon Zima. Kuwayte ....");
                break;
            case MARCH:
                System.out.println("Sezon Vesna. Kuwayte mnoqo ovowey");
                break;
            case APRIL:
                System.out.println("Sezon Vesna. Kuwayte wto-to ...");
                break;
            case MAY:
                System.out.println("Sezon Vesna.Kuwayte wto - to vesennee");
                break;
            case JUNE:
                System.out.println("Sezon Leto. Kuwayte mnoqo kebaba ");
                break;
            case JULY:
                System.out.println("Sezon Leto.Kuwayte Sac na prirode");
                break;
            case AUGUST:
                System.out.println("Sezon Leto.Kuwayte mnoqo");
                break;
            case SEPTEMBER:
                System.out.println("Sezon Osen.Kuwayte wto - to osennee");
                break;
            case OCTOBER:
                System.out.println("Sezon Osen.Rekomenduyu sentyabirskiy menyu");
            case NOVEMBER:
                System.out.println("Sezon Osen.Takje wto i v Oktebre");
                break;
            case DECEMBER:
                System.out.println("Sezon Zima.Kuwayte mnoqo praznicnix salatov");
        }


    }
}

