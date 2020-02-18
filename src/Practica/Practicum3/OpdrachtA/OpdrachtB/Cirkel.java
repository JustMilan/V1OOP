package Practica.Practicum3.OpdrachtA.OpdrachtB;

public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int rad, int x, int y) {
        this.radius = rad;
        this.xPositie = x;
        this.yPositie = y;

        if (rad <= 0) {
            return IllegalArgumentException;
        }
    }

    @Override
    public String toString() {
        return "Cirkel (" + xPositie + yPositie + ") met radius " + radius + Cirkel;
    }
}
