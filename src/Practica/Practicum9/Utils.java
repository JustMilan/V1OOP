package Practica.Practicum9;

public class Utils {
    public static String euroBedrag(double bedrag) {
        return euroBedrag(bedrag, 2);
    }

    public static String euroBedrag(double bedrag, int precisie) {
        return String.format("%." + precisie + "f", bedrag);
    }

}
