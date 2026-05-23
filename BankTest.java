import java.util.Scanner;

public class BankTest {
    public static void main(String[] args) {

        Konto k1 = new Konto("Max Mustermann", 500.0);
        Girokonto g1 = new Girokonto("Lisa Müller", 200.0, 500.0);

        Scanner eingabe = new Scanner(System.in);
        int wahl = -1;

        while (wahl != 0) {
            System.out.println("=== Bank Menü ===");
            System.out.println("1 = Einzahlen");
            System.out.println("2 = Abheben");
            System.out.println("3 = Kontostand anzeigen");
            System.out.println("0 = Beenden");
            System.out.print("Deine Wahl: ");
            wahl = eingabe.nextInt();

            if (wahl == 1) {
                System.out.println("Welches Konto?");
                System.out.println("1 = Max Mustermann");
                System.out.println("2 = Lisa Müller");
                System.out.print("Deine Wahl: ");
                int kontoWahl = eingabe.nextInt();

                if (kontoWahl == 1) {
                    System.out.print("Wie viel € möchten Sie einzahlen?: ");
                    double betrag = eingabe.nextDouble();
                    k1.einzahlen(betrag);
                } else if (kontoWahl == 2) {
                    System.out.print("Wie viel € möchten Sie einzahlen?: ");
                    double betrag = eingabe.nextDouble();
                    g1.einzahlen(betrag);
                }

            } else if (wahl == 2) {
                System.out.println("Welches Konto?");
                System.out.println("1 = Max Mustermann");
                System.out.println("2 = Lisa Müller");
                System.out.print("Deine Wahl: ");
                int kontoWahl = eingabe.nextInt();

                if (kontoWahl == 1) {
                    System.out.print("Wie viel € möchten Sie abheben?: ");
                    double abheben = eingabe.nextDouble();
                    k1.abheben(abheben);
                } else if (kontoWahl == 2) {
                    System.out.print("Wie viel € möchten Sie abheben?: ");
                    double abheben = eingabe.nextDouble();
                    g1.abheben(abheben);
                }

            } else if (wahl == 3) {
                System.out.println("Welches Konto?");
                System.out.println("1 = Max Mustermann");
                System.out.println("2 = Lisa Müller");
                System.out.print("Deine Wahl: ");
                int kontoWahl = eingabe.nextInt();

                if (kontoWahl == 1) {
                    k1.kontostandAnzeigen();
                } else if (kontoWahl == 2) {
                    g1.kontostandAnzeigen();
                }
            } else {
                System.out.println("Vielen Dank für Ihren Besuch!");
            }

        }

        eingabe.close();
    }
}