package Practica.Practicum4.A;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    public Huis(String adres, int bouwjaar) {
        this.bouwjaar = bouwjaar;
        this.adres = adres;
    }

    public Persoon getHuisbaas() {
        return huisbaas;
    }

    public void setHuisbaas(Persoon huisbaas) {
        this.huisbaas = huisbaas;
    }

    @Override
    public String toString() {
        return String.format("Huis %s is gebouwd in %d\nen heeft %s" , adres, bouwjaar, huisbaas);
    }

}

