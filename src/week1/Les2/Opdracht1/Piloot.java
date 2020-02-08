package week1.Les2.Opdracht1;

public class Piloot {

    private String naam;
    private double salaris;
    private int vlieguren;

    public Piloot(String pl) {
        naam = pl;
    }
    
    public double getVlieguren() {
        return vlieguren;
    }
    
    public double getSalaris() {
        return salaris;
    }

    public void setSalaris(double sl) {
        salaris = sl;
    }

    public void verhoogVliegurenMet(int vu) {
        vlieguren = vu;
    }
    public String toString() {
        return "Zonder vlieguren: " + naam + " Heeft " +
                vlieguren + " vlieguren gemaakt en verdient " + salaris;
    }

}



