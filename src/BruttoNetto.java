public class BruttoNetto {
    public static void main (String[] args) {
        int nettoPreis = 200;
        float floatSteuersatz = 0.05f;
        double steuersatz;
        steuersatz = 0.05;
        double maxsteuersatz = 0.5;

        double bruttoPreis;
        bruttoPreis = nettoPreis + nettoPreis * steuersatz;
        System.out.println("Ergebnis: " + bruttoPreis + " €");

        boolean st = steuersatz < maxsteuersatz;
        System.out.println ("result " + st);

    }
}
