package Practica.Practicum8;

import java.util.Objects;

public class Fiets extends Voertuig {
    private int framenummer;


    public Fiets(String tp, double pr, int jr, int fr) {
        super(tp, pr, jr);
        framenummer = fr;
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
