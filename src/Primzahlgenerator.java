// Aufgabe:
// Entwerfen Sie eine Klasse, die Primzahlen erzeugen kann, beginnend bei einem Startwert.
// Nachfolgende Aufrufe derselben Methode liefern jeweils die nächstfolgenden Primzahlen.

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

    // TODO
    // Ergänzen Sie in der Klasse die Methode zum Geniereren der Primzahlen
    // z.B. int generate()
}
