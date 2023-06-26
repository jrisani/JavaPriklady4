package oop;

public class SkladOvocia {
    public static void main(String[] args) {
        Ovocie jablko = new Ovocie();
        jablko.farba = "zelená";
        jablko.jeSladke = true;
        jablko.mnozstvoVitaminov = 90;
        jablko.odroda = "Red delicious";
        jablko.nazov = "Jablko";

        Ovocie hruska = new Ovocie();
        hruska.farba = "zelená";
        hruska.jeSladke = true;
        hruska.mnozstvoVitaminov = 80;
        hruska.odroda = "domáca";
        hruska.nazov = "Hruška";

        System.out.println("Názov ovocia: " + jablko.akeOvocie());
        System.out.println("Farba ovocia: " + jablko.farba);
        System.out.println("Je sladké:" + jablko.jeSladke);
        System.out.println("Množstvo vitamínov: " + jablko.mnozstvoVitaminov);
        System.out.println("Odroda: " + jablko.odroda);

        System.out.println("");  //Prázdny riadok

        System.out.println("Názov ovocia: " + hruska.akeOvocie());
        System.out.println("Farba ovocia: " + hruska.farba);
        System.out.println("Je sladké:" + hruska.jeSladke);
        System.out.println("Množstvo vitamínov: " + hruska.mnozstvoVitaminov);
        System.out.println("Odroda: " + hruska.odroda);
    }
}
