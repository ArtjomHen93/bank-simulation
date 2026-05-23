public class Girokonto extends Konto {

    double dispoLimit;

    Girokonto(String inhaber, double startguthaben, double dispoLimit) {
        super(inhaber, startguthaben);
        this.dispoLimit = dispoLimit;
    }

    void dispoAbheben(double betrag) {
        if (betrag > kontostand + dispoLimit) {
            System.out.println("Fehler: Dispo-Limit überschritten!");
        } else {
            kontostand = kontostand - betrag;
            System.out.println(betrag + "€ abgehoben. Neuer Kontostand: " + kontostand + "€");
        }
    }

}