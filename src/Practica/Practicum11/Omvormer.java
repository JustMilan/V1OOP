package Practica.Practicum11;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Omvormer {

    public static void omvormerFunc(Path bronbestand, Path targetfile, double gewensteValuta) throws IOException {
        List<String> lines = Files.readAllLines(bronbestand);
        List<String> nieuweValuta = new ArrayList<>();
        BufferedWriter out = Files.newBufferedWriter(targetfile);

        for (String line : lines) {
            String[] splitter = line.split(" : ");
            double dollarString = Double.parseDouble(splitter[1]);
            double naarEuro = dollarString * gewensteValuta;
            DecimalFormat numberFormat = new DecimalFormat("#.00");
            nieuweValuta.add((splitter[0] + " : " + numberFormat.format(naarEuro)));
        }

        for (String productline : nieuweValuta) {
            out.write(productline);
            out.newLine();
        }

        System.out.println("Conversie is gelukt!");
        out.close();
    }

    public static void main(String[] args) {
        System.out.print("Voer bronbestand in: ");
        Scanner keyboardScanner = new Scanner(System.in);
        String stringBronbestand = keyboardScanner.nextLine();
        Path bronbestand = Path.of(stringBronbestand);
        System.out.println("Bron: " + stringBronbestand);

        System.out.print("Voer target file in: ");
        Scanner keyboardScanner2 = new Scanner(System.in);
        String stringTargetfile = keyboardScanner2.nextLine();
        Path targetfile = Path.of(stringTargetfile);

        System.out.print("voor de gewenste valuta in: ");
        Scanner keyboardScanner3 = new Scanner(System.in);
        double gewensteValuta = 0;

        try {
            gewensteValuta = Double.parseDouble(keyboardScanner3.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Voer een geldig getal in.");
        }

        if (Files.notExists((bronbestand))) {
            System.out.println("Het opgegeven bronbestand bestaat niet.");
        } else if (!Files.isRegularFile(bronbestand)) {
            System.out.println("U heeft een niet leesbaar bestand geselecteerd.");
        } else {
            try {
                Files.notExists(targetfile);
                Files.createFile(targetfile);
                System.out.println("Nieuw target file is gemaakt: " + targetfile);

                omvormerFunc(bronbestand, targetfile, gewensteValuta);
            } catch (Exception e) {
                System.out.println("Het opgegeven bestand bestaat al, probeer een andere naam");
            }
        }
    }
}