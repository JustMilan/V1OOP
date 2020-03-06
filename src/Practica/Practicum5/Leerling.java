package Practica.Practicum5;

public class Leerling {
    private String naam;
    private double cijfer;


    public Leerling(String nm){
        naam = nm;
    }

    public String getNaam() {
        return naam;
    }

    public double getCijfer() {
        return cijfer;
    }

    public void setCijfer(double cijfer) {
        this.cijfer = cijfer;
    }

    @Override
    public String toString() {
        return "Leerling{" +
                "naam='" + naam + '\'' +
                ", cijfer=" + cijfer +
                '}';
    }
}
