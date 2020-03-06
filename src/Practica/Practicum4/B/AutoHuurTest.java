package Practica.Practicum4.B;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutoHuurTest {
    private AutoHuur testAutoHuur;
    private Klant testKlant;
    private Auto testAuto;

    @BeforeEach
    public void init(){
        testAutoHuur = new AutoHuur();
        testKlant = new Klant("test");
        testAuto = new Auto("test 200", 900);
    }

    @Test
    void autoType(){
        System.out.println(testAuto);
        assertEquals("test 200", );
    }
}
