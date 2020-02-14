package Week2.Les4.Opdracht2;

public class Eigenaar {
    private String naam;
    private int giroNr;

    public Eigenaar(String nm) {
        naam = nm;
    }

    public String getNaam() {
        return naam;
    }

    public int getGiroNr() {
        return giroNr;
    }

    public void setGiroNr(int giroNr) {
        this.giroNr = giroNr;
    }

    @Override
    public String toString() {
        return naam + " en heeft giro " + giroNr;
    }
}
