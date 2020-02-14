package Practica.Practicum2.A;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad(double breedte, double lengte, double diepte) {
        this.breedte = breedte;
        this.lengte = lengte;
        this.diepte = diepte;
    }

    public Zwembad() {}

    public double getBreedte() {
        return breedte;
    }

    public double getDiepte() {
        return diepte;
    }

    public double getLengte() {
        return lengte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public void setDiepte(double diepte) {
        this.diepte = diepte;
    }

    public double inhoud() {
        return lengte * breedte * diepte;
    }

    @Override
    public String toString() {
        return "Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte + " meter diep.";
    }
}
