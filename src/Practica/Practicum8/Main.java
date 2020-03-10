package Practica.Practicum8;

public class Main {
    public static void main(String[] args) {
        BedrijfsInventaris eerste = new BedrijfsInventaris("test", 350000);
        Computer onderdeel1 = new Computer("Mac Pro", "1233215", 65000, 2020);
        Computer onderdeel2 = new Computer("Mac Pro", "1233215", 65000, 2020);

        Auto eersteAuto = new Auto("Tesla model S", 120000, 2019, "420-K-69");
        Auto tweedeAuto = new Auto("Tesla model S", 120000, 2019, "420-K-69");
        Auto derdeAuto = new Auto("Tesla model X", 140000, 2018, "69-KK-01");

        Fiets fietsie1 = new Fiets("Batavus G69", 1500, 2018, 4206969);
        Fiets fietsie2 = new Fiets("Batavus G69", 1500, 2018, 4206969);
        Fiets fietsie3 = new Fiets("Gazelle MX420", 1320, 2019, 6969420);

    }
}

//➔ Programmeer het gegeven domeinmodel en schrijf nu zelf een Main-klasse om je code te controleren.
// Voer minimaal de volgende acties uit:
//
//        ➔ Controleer in de uitvoer (of schrijf een unittest) of...:
//        telkens maar één van de twee dezelfde objecten is aangeschaft.
//        het aanschaffen mislukt als er onvoldoende budget is.
//        het berekenen van de huidige waarde correct gebeurt.
