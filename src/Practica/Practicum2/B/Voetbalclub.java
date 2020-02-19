package Practica.Practicum2.B;

public class Voetbalclub {
    private final String naam;
    int aantalGewonnen = 0;
    int aantalGelijk = 0;
    int aantalVerloren = 0;

    public Voetbalclub(String naam) {

           if (!naam.equals("")) {
               this.naam = naam;
           }
           else {
           this.naam = "FC";
        }
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen += 1;
        if (ch == 'g')
            aantalGelijk += 1;
        if (ch == 'v')
            aantalVerloren += 1;
    }

    public int aantalPunten() {
        return aantalGewonnen * 3 + aantalGelijk;
    }
    public int aantalGespeeld() {
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }

    @Override
    public String toString() {
        return naam + " " + " " + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + aantalPunten();
    }
}
