// Aufgabe:
// Entwerfen Sie eine Klasse, die Primzahlen erzeugen kann, beginnend bei einem Startwert.
// Nachfolgende Aufrufe derselben Methode liefern jeweils die nächstfolgenden Primzahlen.

// Beginn einer Lösung:
public class Primzahlgenerator {

    // TODO
    // Machen Sie eine richtige Klasse daraus, d.h. ergänzen Sie
    // erstmal notwendige Attribute und einen entsprechenden Konstruktor!
    // Hinweis: Die Aufgabenstellung spricht von einem "Startwert" für
    // den Generator. Es spricht nichts dagegegen, das Attribut auch so
    // zu nennen

    // statische Methode als Helfer, nutzbar ohne Instanz der Klasse
    // (Klassenmethode)
    public static boolean istPrimzahl(int zahl) {
        for (int teiler = 2; teiler < zahl; teiler++) {
            if (zahl % teiler == 0) return false;
        }
        return true;
    }

}
