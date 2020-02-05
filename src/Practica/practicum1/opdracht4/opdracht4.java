package Practica.practicum1.opdracht4;

public class opdracht4 {
    public static void main(String[] args) {
        int low = 1;
        int high = 39;
        int som = 0;

        while (low <= high) {
            som += low;
            low += 1;

        }
        System.out.println(som);
    }
}
