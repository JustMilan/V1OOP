package Practica.Practicum3.OpdrachtB;

public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int rad, int x, int y) {
        this.radius = rad;
        this.xPositie = x;
        this.yPositie = y;

        if (rad <= 0) {
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");
        }
    }


    @Override
    public String toString() {
        return "Cirkel (" + xPositie + " , " + yPositie + ") met radius " + radius;
    }
}
