package week1.les1.opdracht2;

public class Main {
    public static void main(String[] arg) {
        Klant k1 = new Klant("Jan", "Neijenoord 1", "Utrecht");
        Klant k2 = new Klant("Wim", "Oudenoord 340", "Utrecht");
        Klant k3 = new Klant("Milan", "Waal 15", "Waal");

        System.out.println("De gegevens van nr1 zijn:" + k1);
        System.out.println("De gegevens van nr2 zijn:" + k2);
        System.out.println("De gegevens van nr3 zijn:" + k3);
    }
}


