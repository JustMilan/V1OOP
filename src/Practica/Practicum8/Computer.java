package Practica.Practicum8;

import java.time.LocalDate;

public class Computer implements Goed {
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;


    public Computer(String tp, String adr, double pr, int jr) {
        type = tp;
        macAdres = adr;
        aanschafPrijs = pr;
        productieJaar = jr;
    }

    @Override
    public double huidigeWaarde() {
        return aanschafPrijs * Math.pow(0.6, LocalDate.now().getYear() - this.productieJaar);

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Computer) {
            Computer pc = (Computer) obj;
            return type.equals(pc.type) && productieJaar == pc.productieJaar; //int is primitive dus kan geen equals
        }
        return false;
    }


    @Override
    public String toString() {
        return String.format("Computer %s, met macAdres %s koste " + Utils.euroBedrag(huidigeWaarde()) + " en is gemaakt in %s", type, macAdres, productieJaar);
    }
}
