package Practica.Practicum7;

import java.util.ArrayList;

public class StringProcessor {
    private ArrayList<OpmaakProces> processen = new ArrayList<>();

    public StringProcessor() {}

    public String verwerk(String input) {
        String temp = input;
        for (OpmaakProces proces: processen) {
            temp = proces.maakOp(temp);
        }
        return temp;
    }
    public void voegProcesToe(OpmaakProces proces) {
        processen.add(proces);
    }
}
