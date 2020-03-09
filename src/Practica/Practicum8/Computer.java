package Practica.Practicum8;

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
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "type='" + type + '\'' +
                ", macAdres='" + macAdres + '\'' +
                ", aanschafPrijs=" + aanschafPrijs +
                ", productieJaar=" + productieJaar +
                '}';
    }
}
