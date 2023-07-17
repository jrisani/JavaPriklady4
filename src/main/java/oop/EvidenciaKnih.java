package oop;

import java.util.ArrayList;

public class EvidenciaKnih {
    public static void main(String[] args) {
        // TODO Ako vytvoriť knihu a naplniť ju údajmi, ciže vytvorime objekt Kniha
        Kniha kniha1 = new Kniha(); // Vytvorili sme objekt kniha, resp. inštanciu triedy Kniha, ktory zatial neobsahuje ziadne konkretne udaje
        // A nasledne knihu naplnime konkretnymi udajmi
        kniha1.autor = "Isaac Asimov";
        kniha1.nazov = "Já, robot";
        kniha1.cena = 3.80;
        kniha1.pocetStran = 150;
        kniha1.rokVydania = 1960;
        //System.out.println(kniha1.pozdrav());
        kniha1.pozdrav();

        //Vypiseme obsah knihy
        System.out.println("Autor knihy: " + kniha1.autor);
        System.out.println("Názov knihy: " + kniha1.nazov);
        System.out.println("Cena: " + kniha1.cena);
        System.out.println("Počet strán: " + kniha1.pocetStran);
        System.out.println("Rok vydania: " + kniha1.rokVydania);

        //Kniha kniha2 = null;        // Prazdny objekt, pretoze je null
        
        //TODO Vytvorit dalsiu knihu
        Kniha kniha2 = new Kniha();
        kniha2.autor = "J.R.R. Tolkien";

        kniha2.nazov = "Hobit";
        if (kniha2 != null) {
            //Vypiseme obsah knihy
            System.out.println("Autor knihy: " + kniha2.autor);
            System.out.println("Názov knihy: " + kniha2.nazov);
            if (kniha2.nazov == null)
                System.out.println("Názov knihy je naozaj prázdny");
            else
                System.out.println("Názov knihy: " + kniha2.nazov);
            System.out.println("Cena: " + kniha2.cena);
            System.out.println("Počet strán: " + kniha2.pocetStran);
            System.out.println("Rok vydania: " + kniha2.rokVydania);
            kniha2.pozdrav();
        }
        // Vytvarame 3-tiu knihu
        Kniha kniha3 = null; // Ak prirademe null, tak objekt Kniha v premennej kniha3 neexistuje

        // Prostrednictvom vynimky try-catch overujeme ci je objekt kniha3 vytvoreny
        try {
            kniha3.autor = "F.Herbert";
            kniha3.nazov = "Duna";
        } catch (NullPointerException e) {
            System.out.println("Objekt kniha3 je null, nie je vytvorený");
        }

        ArrayList dynamickePole = new ArrayList() ;
        if (dynamickePole.isEmpty()) {  // Testujeme ci je ArrayList prazdny, cize to znamena, ze sme nepridali ziadny "obsah". Neznamena to, ze sme ho otestovali na null.
            System.out.println("Dynamicke pole vytvorene ArrayList-om je prázdne!");
        }
    }
}
