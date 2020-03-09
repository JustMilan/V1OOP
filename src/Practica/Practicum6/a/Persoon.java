package Practica.Practicum6.a;

import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> mijnGames = new ArrayList<>();

    public Persoon(String naam, double budget) {
        this.naam = naam;
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game g) {
        if ((budget - g.huidigeWaarde()) >= 0 && !mijnGames.contains(g)) {
            budget -= g.huidigeWaarde();
            mijnGames.add(g);
            return true;
        }
         else {
            return false;
        }
    }

        public boolean verkoop (Game g, Persoon koper) {
            if (mijnGames.contains(g) && koper.koop(g)) {
                budget += g.huidigeWaarde();
                mijnGames.remove(g);
                return true;
            }
            return false;

        }



    @Override
    public String toString() {
        StringBuilder output = new StringBuilder(String.format("%s heeft een budget van €%.2f en bezit de volgende games:", naam, budget));
        for (Game game: mijnGames) {
            output.append('\n').append(game.toString());
        }
        return output.toString();
    }
}
