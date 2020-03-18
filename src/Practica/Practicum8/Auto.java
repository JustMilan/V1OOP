package Practica.Practicum8;

import java.time.LocalDate;

public class Auto extends Voertuig {
    private String kenteken;

    public Auto(String tp, double pr, int jr, String kt) {
        super(tp, pr, jr);
        kenteken = kt;
    }

    @Override
    public double huidigeWaarde() {
        return nieuwprijs * Math.pow(0.7, LocalDate.now().getYear() - this.bouwjaar);
    }

    @Override
    // Wat is hier Object obj????
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Voertuig) {
            return true;
        }
        return false;
    }

}
