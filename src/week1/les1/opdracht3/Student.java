package week1.les1.opdracht3;

public class Student {
    public Student(String naam) {
        this.naam = naam;
    }

    private String naam;

    public String getNaam() {
        return naam;
    }
    public String toString() {
        return "Deze student heet " + naam;
    }
}
