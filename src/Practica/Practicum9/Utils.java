package Practica.Practicum9;

public class Utils {
    private static int hoeVaak = 0;

    public static String euroBedrag(double bedrag) {
        return euroBedrag(bedrag, 2);
    }

    public static String euroBedrag(double bedrag, int precisie) {
        hoeVaak++;
        return String.format("%." + precisie + "f", bedrag);

    }

    public static int getHoeVaak() {
        return hoeVaak;
    }
}
