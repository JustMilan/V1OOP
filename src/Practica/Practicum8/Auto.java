package Practica.Practicum8;

import java.util.Objects;

public class Auto extends Voertuig {
    private String kenteken;

    public Auto(String tp, double pr, int jr, String kt) {
        super(tp, pr, jr);
        kenteken = kt;
    }

    @Override
    public double huidigeWaarde() {
        return super.huidigeWaarde();
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

}
