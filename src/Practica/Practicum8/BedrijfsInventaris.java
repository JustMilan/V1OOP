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

    public void schafAan(Goed g) {
        if (!alleGoederen.contains(g) && g.huidigeWaarde() <= budget) {
            alleGoederen.add(g);
            budget -= g.huidigeWaarde();
        }
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder(String.format("Bedrijf %s heeft een budget van %.2f", bedrijfsnaam, budget));
        for (Goed g : alleGoederen) {
            output.append('\n').append(g.toString());
        }
        return output.toString();
    }
}
