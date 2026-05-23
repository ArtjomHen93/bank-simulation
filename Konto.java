public class Konto {

    String inhaber;
    double kontostand;

    Konto(String inhaber, double startguthaben) {
        this.inhaber = inhaber;
        this.kontostand = startguthaben;
    }

    void einzahlen(double betrag) {
        kontostand = kontostand + betrag;
        System.out.println(betrag + "€ eingezahlt. Neuer Kontostand: " + kontostand + "€");
    }

    void abheben(double betrag) {
        if (betrag > kontostand) {
            System.out.println("Fehler: nicht genug Geld! Kontostand: " + kontostand + "€");
        } else {
            kontostand = kontostand - betrag;
            System.out.println(betrag + "€ abgehoben. Neuer Kontostand: " + kontostand + "€");
        }
    }

    void kontostandAnzeigen() {
        System.out.println("Kontostand von " + inhaber + ": " + kontostand + "€");
    }

}

