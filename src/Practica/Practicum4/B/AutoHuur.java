package Practica.Practicum4.B;


public class AutoHuur {
    private Klant huurder;
    private Auto gehuurdeAuto;
    private int aantalDagen;

    public AutoHuur() {
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setAantalDagen(int aD) {
        aantalDagen = aD;
    }

    public Object getGehuurdeAuto() {

        return gehuurdeAuto;

    }

    public void setGehuurdeAuto(Auto gA) {
        gehuurdeAuto = gA;
    }

    public Object getHuurder() {
        return huurder;
    }


    public void setHuurder(Klant k) {
        huurder = k;
    }

    public double totaalPrijs() {
        if (gehuurdeAuto != null && aantalDagen != 0 && huurder.getKorting() != 0) {
            double totaalprijs = 0;
            double korting = (100 - huurder.getKorting()) / 100;

            totaalprijs = gehuurdeAuto.getPrijsPerDag() * aantalDagen * korting;
            return totaalprijs;
        }
        else {
            return 0.0;
        }
    }

    @Override

    public String toString() {
        String huurderText = "Er is geen huurder bekend.";
        String autoText = "Er is geen auto bekend.";

        if(huurder != null){
            huurderText = huurder.toString();
        }

        if (gehuurdeAuto != null) {
            autoText = gehuurdeAuto.toString();
        }

        return autoText + "" + '\n'
                + huurderText + '\n' + "Aantal dagen: " + aantalDagen + " en dat kost: " + totaalPrijs();
    }

}
