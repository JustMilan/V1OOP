package Practica.Practicum2.B;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VoetbalclubTest {
    private Voetbalclub t;
    private Voetbalclub t1;

    @BeforeEach
    public void init() {
        System.out.println("init");
        t = new Voetbalclub("testclub");
    }

    @Test
    void winstPunten() {
        System.out.println("winstPunten");

        t.verwerkResultaat('w');
        assertEquals(3, (t.aantalPunten()));
    }
    @Test
    void gelijkPunten() {
        System.out.println("gelijkPunten");

        t.verwerkResultaat('g');
        assertEquals(1, (t.aantalPunten()));
    }

    @Test
    void verlorenPunten() {
        System.out.println("verlorenPunten");

        t.verwerkResultaat('v');
        assertEquals(0, t.aantalPunten());
    }

    @Test
    void herhaaldelijkOptellen() {
        System.out.println("herhaaldelijkOptellen");

        t1 = new Voetbalclub("Testclub1");

        t1.verwerkResultaat('w');
        t1.verwerkResultaat('g');
        t1.verwerkResultaat('g');
        t1.verwerkResultaat('w');
        t1.verwerkResultaat('v');
        t1.verwerkResultaat('v');
        t1.verwerkResultaat('v');
        t1.verwerkResultaat('g');
        t1.verwerkResultaat('w');
        t1.verwerkResultaat('w');

        System.out.println(t1);

        assertEquals("Testclub1  10 4 3 3 15",
                t1.toString());


    }

    @Test
    void invoernull() {
        System.out.println("invvoernull");

        t1 = new Voetbalclub(null);

        assertEquals("FC", t1.getNaam(), "Het systeem gaat niet goed om met een voetbalclub met naam null");
    }

    @Test
    void invoerleeg() {
        t1 = new Voetbalclub("");

        assertEquals("FC", t1.getNaam());
    }
}

