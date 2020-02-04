package week1.les1.opdracht5;

public class Student {
    public Student(String naam, int studentnummer) {
        this.naam = naam;
        this.studentnummer = studentnummer;
    }
    private String naam;
    private int studentnummer;

    public String getNaam() {return naam;}

    public void setNaam(String naam) {this.naam = naam;}

    public void setStudentNummer(int studentnummer) {this.studentnummer = studentnummer;}

    public int getStudentNummer() {return studentnummer;}

    public String toString() {
        return "Deze student heet : '" + naam + "en " +
                "heeft studentnummer: " + studentnummer;
    }
}