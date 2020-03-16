package Practica.Practicum7;

public class SpatieUnder implements OpmaakProces{ // Zelf toegevoegd om het te begrijpen.
    private String oud;
    private String nieuw;

    public SpatieUnder(String oud, String nieuw){
        this.oud = oud;
        this.nieuw = nieuw;
    }


    @Override
    public String maakOp(String input) {
        return input.replace(oud, nieuw);
    }
}
