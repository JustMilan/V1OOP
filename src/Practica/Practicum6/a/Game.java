package Practica.Practicum6.a;

import java.time.LocalDate;

public class Game {
    private String naam;
    private int releasejaar;
    private double nieuwprijs;

    public Game(String naam, int releasejaar, double nieuwprijs) {
        this.naam = naam;
        this.releasejaar = releasejaar;
        this.nieuwprijs = nieuwprijs;
    }

    public String getNaam() {
        return naam;
    }

    public double huidigeWaarde() {
        return nieuwprijs * Math.pow(0.7, LocalDate.now().getYear() - this.releasejaar);
    }

    public boolean equals(Object andereObject) {
        if (this == andereObject) {
            return true;
        }
        if (andereObject instanceof Game){
            Game game = (Game) andereObject;
            return releasejaar == game.releasejaar && naam.equals(game.naam);
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s, uitgegeven in %d; nieuwprijs: €%.2f nu voor: €%.2f", this.naam, this.releasejaar, this.nieuwprijs, this.huidigeWaarde());
    }
}
