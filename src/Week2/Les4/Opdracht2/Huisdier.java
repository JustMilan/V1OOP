package Week2.Les4.Opdracht2;

public class Huisdier {
    private String naam;
    private String ras;
    private double gewicht;
    private Eigenaar baasje;
    private Eigenaar giroNummer;

    public Huisdier(String nm, String r) {
        naam = nm;
        ras = r;
    }

    public Eigenaar getGiroNummer() {
        return giroNummer;
    }

    public Eigenaar getBaasje() {
        return baasje;
    }

    public void setBaasje(Eigenaar baasje) {
        this.baasje = baasje;
    }

    @Override
    public String toString() {
        return naam + ", " + ras + ", weegt " + gewicht + " kg." + '\n' +
                "En de eigenaar is: " + baasje;
    }
}
