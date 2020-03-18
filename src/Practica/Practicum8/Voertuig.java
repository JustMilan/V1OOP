package Practica.Practicum8;

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
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s heeft een waarde van %.2f en heeft bouwjaar %s", type, huidigeWaarde(), bouwjaar);
    }

    @Override
    public double huidigeWaarde() {
        return 0;
    }
}
