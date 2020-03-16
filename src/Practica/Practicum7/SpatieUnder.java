package Practica.Practicum7;

public class SpatieUnder implements OpmaakProces{ // Zelf toegevoegd om het te begrijpen.

    @Override
    public String maakOp(String input) {
        return input.replace(" ", "_");
    }
}
