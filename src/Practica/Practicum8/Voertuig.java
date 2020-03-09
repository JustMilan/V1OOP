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
        return true;
    }

    @Override
    public String toString() {
        return "Voertuig{" +
                "type='" + type + '\'' +
                ", nieuwprijs=" + nieuwprijs +
                ", bouwjaar=" + bouwjaar +
                '}';
    }

    @Override
    public double huidigeWaarde() {
        return 0;
    }
}
