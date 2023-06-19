package test;

public class PriradenieZnamky {
    public static void hodnot(int percenta) {
        if (percenta >= 90) {
            System.out.println("Tvoja známka je A");
        } else if (percenta >= 75 && percenta < 90) {
            System.out.println("Tvoja známka je B");
        } else if (percenta >= 65 && percenta < 75) {
            System.out.println("Tvoja známka je C");
  /*          } else if (percenta < 0) {
               // break;          //Stopneme nekonečný vyklus, pokial while(true)*/       //tento riadok v pripade cez true
        } else if (percenta >= 0 && percenta < 65)
            System.out.println("Neuspel");
        else
            System.out.println("Neočakávaná vstupná hodnota");
    }
    }

    public static void main(String[] args) {
        double a = 2.5; // Strana a
        double b = 3.5; // Strana b

        System.out.println("Obvod obdĺžnika je: " + Obdlznik.vypocitajObvod(a, b));
        System.out.println("Obsah obdĺžnika je: " + Obdlznik.vypocitajObsah(a, b));
}
