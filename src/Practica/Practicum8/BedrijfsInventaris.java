package Practica.Practicum8;

import java.util.ArrayList;

public class BedrijfsInventaris {
    private String bedrijfsnaam;
    private double budget;
    private ArrayList<Goed> alleGoederen = new ArrayList<>();

    public BedrijfsInventaris(String nm, double bud) {
        bedrijfsnaam = nm;
        budget = bud;
    }

    public void schafAan(Goed g) {}

    @Override
    public String toString() {
        return "BedrijfsInventaris{" +
                "bedrijfsnaam='" + bedrijfsnaam + '\'' +
                ", budget=" + budget +
                '}';
    }
}
