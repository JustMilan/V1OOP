package Practica.Practicum5;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Klas {
    private String KlasCode;
    private Leerling deLeerlingen;
    ArrayList<Leerling> leerlingen = new ArrayList<Leerling>();
    private Leerling leerling;
    private double nweCijfer;
    private String naam;

    public Klas(String kC) {
        this.KlasCode = kC;
    }

    public void voegLeerlingToe(Leerling l) {
        this.leerling = l;
    }

    public void wijzigCijfer(String nm, double nweCijfer){
        String naam = nm;
        this.nweCijfer = nweCijfer;
    }

    public ArrayList<Leerling> getLeerling(){
        return leerlingen;
    }

    public int aantalLeerlingen() {
        int aantal = 0;

        for (int i=0; i<=leerlingen.size(); i++){
            aantal += 1;
        }
        return aantal;
        }

    @Override
    public String toString() {
        return "In klas " + KlasCode + " zitten de volgende leerlingen: " +
                deLeerlingen + "heeft cijfer: " + nweCijfer;
    }
}

//In klas V1Z zitten de volgende leerlingen:
//Hans heeft cijfer: 0.0
//Jan heeft cijfer: 0.0
//Wim heeft cijfer: 0.0
//
//In klas V1Z zitten de volgende leerlingen:
//Hans heeft cijfer: 7.6
//Jan heeft cijfer: 0.0
//Wim heeft cijfer: 0.0
//
//Aantal leerlingen: 3
