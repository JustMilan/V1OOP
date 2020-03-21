package Practica.Practicum5;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Klas {
    private String KlasCode;
    ArrayList<Leerling> leerlingen = new ArrayList<>();

    public Klas(String kC) {
        this.KlasCode = kC;
    }

    public void voegLeerlingToe(Leerling l) {
        leerlingen.add(l);
    }

    public void wijzigCijfer(String nm, double nweCijfer) {
        for (Leerling leerling : leerlingen) {
            if (leerling.getNaam().equals(nm)) {
                leerling.setCijfer(nweCijfer);
            }
        }
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
        StringBuilder leerlingenResultaten = new StringBuilder();
        for (Leerling leerling : leerlingen) {
            leerlingenResultaten.append(leerling.toString()).append('\n');
        }

        return "In klas " + KlasCode + " zitten de volgende leerlingen: '\n" +
                leerlingenResultaten;

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
