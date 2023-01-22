// Aufgabe:
// Entwerfen Sie eine Klasse, die Primzahlen erzeugen kann, beginnend bei einem Startwert.
// Nachfolgende Aufrufe derselben Methode liefern jeweils die nächstfolgenden Primzahlen.

import java.util.Scanner;

// Vollständige Lösung:
public class Primzahlgenerator {
    // Attribut: startwert
    // (Prinzip der Kapselung: alle Attribute sind private)
    private int startwert;

    // Aufgaben eines Konstruktor:
    // Alle Attribute der Klasse auf einen Startwert setzen
    // (typischerweise als Parameter des Konstruktors)
    public Primzahlgenerator(int startwert) {
        this.startwert = startwert;
    }

    // statische Methode als Helfer, nutzbar ohne Instanz der Klasse
    // (Klassenmethode)
    public static boolean istPrimzahl(int zahl) {
        for (int teiler = 2; teiler < zahl; teiler++) {
            if (zahl % teiler == 0) return false;
        }
        return true;
    }

    // Instanzmethode (kann nur mit einer Instanz genutzt werden)
    // laut Aufgabe: Nachfolgende Aufrufe derselben Methode liefern
    // jeweils die nächstfolgenden Primzahlen.
    public int generate() {
        do {
            startwert++;
        } while ( ! istPrimzahl(startwert) );
        return startwert;
    }

    // Hauptprogramm
    // (hat hier eigentlich nichts verloren, dient hier als Test und Simplifizierung)
    // Anwender kann einen Startwert und die Anzahl zu generierender Primzahlen eingeben
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Bitte geben Sie den Startwert ein: ");
        int startwert = eingabe.nextInt();
        System.out.print("Bitte geben Sie die Anzahl ein: ");
        int anzahl = eingabe.nextInt();

        Primzahlgenerator primzahlgenerator = new Primzahlgenerator( startwert );
        for (int i=0; i<anzahl; i++) {
            System.out.println( primzahlgenerator.generate() );
        }
    }
}
