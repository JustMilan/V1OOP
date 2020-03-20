package Practica.Practicum4.A;

public class Persoon {
    private String naam;
    private int leeftijd;

    public Persoon(String nm, int lft) {
        this.naam = nm;
        this.leeftijd = lft;
    }

    @Override
    public String toString() {
        return String.format("%s; leeftijd %d jaar", naam, leeftijd);
    }
}
