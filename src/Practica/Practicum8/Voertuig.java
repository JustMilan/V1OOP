package Practica.Practicum8;

import java.time.LocalDate;

public class Voertuig implements Goed {
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String tp, double pr, int jr) {
        type = tp;
        nieuwprijs = pr;
        bouwjaar = jr;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Voertuig) {
            Voertuig voertuig = (Voertuig) obj;
            return type.equals(voertuig.type) && bouwjaar == voertuig.bouwjaar; //int is primitive dus kan geen equals
        }
        return false;
    }

    @Override
    public double huidigeWaarde() {
        return nieuwprijs * Math.pow(0.7, LocalDate.now().getYear() - this.bouwjaar);
    }

    @Override
    public String toString() {
        return String.format("%s heeft een waarde van " + Utils.euroBedrag(huidigeWaarde()) + " en heeft bouwjaar %s", type, bouwjaar);
    }
}
