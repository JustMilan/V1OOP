package Practica.Practicum8;

import java.time.LocalDate;

public class Fiets extends Voertuig {
    private int framenummer;


    public Fiets(String tp, double pr, int jr, int fr) {
        super(tp, pr, jr);
        framenummer = fr;
    }

    @Override
    public double huidigeWaarde() {
        return nieuwprijs * Math.pow(0.9, LocalDate.now().getYear() - this.bouwjaar);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Fiets) {
            return true;
        }
        return false;
    }
}
