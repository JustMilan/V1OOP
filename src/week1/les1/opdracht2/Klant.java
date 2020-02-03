package week1.les1.opdracht2;

public class Klant
{
    public Klant(String naam, String adres, String plaats) {
        this.naam = naam;
        this.adres = adres;
        this.plaats = plaats;
    }

    private String naam;
    private String adres;
    private String plaats;

    public String getNaam() {
        return naam;
    }

    public String getAdres() {
        return adres;
    }

    public String getPlaats() {
        return plaats;
    }

    public String toString() {
        return "Klant{" +
                "naam='" + naam + '\'' +
                ", adres='" + adres + '\'' +
                ", plaats='" + plaats + '\'' +
                '}';
    }
}
