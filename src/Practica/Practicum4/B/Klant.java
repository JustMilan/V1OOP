package Practica.Practicum4.B;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public Klant(String naam){
        this.naam = naam;
    }

    public double getKorting(){
        return kortingsPercentage;
    }

    public void setKorting(double kortingsPercentage) {
        this.kortingsPercentage = kortingsPercentage;
    }

    @Override
    public String toString() {
        return "Op naam van: " + naam +
                "(korting: " + kortingsPercentage + "%)";
    }

    public String getNaam() {
        return naam;
    }
}
