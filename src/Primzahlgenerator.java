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
    // Der Anwender soll einen Startwert und die Anzahl zu generierender Primzahlen eingeben
    public static void main(String[] args) {
        // TODO
        // Ergänzen Sie Ihre Klasse mit einem Hauptprogramm, um die Klasse zu testen.
        // Es soll dabei ein Primzahlgenerator angelegt werden, dessen Startwert vom Anwender
        // zu erfragen ist. Danach sollen eine bestimme Anzahl Primzahlen generiert werden.
        // Die Anzahl soll ebenfalls vom Anwender angefragt werden.
        // Anmerkung: Das Hauptprogramm sollte normalerweise nicht in dieser Klasse
        // eingebaut werden. Dies dient jetzt nur zur Vereinfachung des Programmcodes.
    }
}
