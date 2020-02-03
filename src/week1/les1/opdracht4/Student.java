package week1.les1.opdracht4;

public class Student {
    public Student(String naam) {
        this.naam = naam;
    }
    private String naam;

    public String getNaam() {
        return naam;
    }

    public String toString() {
        return "studentnaam is " + naam;
    }
}