package oop.konstruktory;

public class Hrackarstvo {
    public static void main(String[] args) {
        //  Vytvorime prvu hracku

        Hracka moncici = new Hracka();  // Vytvorili sme novy objekt Hracka
        moncici.setNazov("Mončiči");
        moncici.setCena(15.0);
        moncici.setFarba("ružové");
        moncici.setMaterial("plyš");
        moncici.setVekoveUrcenie("0-99");

        System.out.println("Atribúty hračky");
        System.out.println("Názov: " + moncici.getNazov());
        System.out.println("Cena: " + moncici.getCena());
        System.out.println("Farba: " + moncici.getFarba());
        System.out.println("Materiál: " + moncici.getMaterial());
        System.out.println("Vekové určenie: " + moncici.getVekoveUrcenie());

        // Vytvorime druhu hracku - poradie naplnenia public Hracka(String material, String farba, double cena, String vekoveUrcenie, String nazov)
        Hracka lego = new Hracka("plast", "farebné", 15.50, "0-99", "lego"); // Vytvorili sme objekt cez parametricky konstruktor

        //Vypiseme atributy druhej hracky
        System.out.println("Atribúty hračky");
        System.out.println("Názov: " + lego.getNazov());
        System.out.println("Cena: " + lego.getCena());
        System.out.println("Farba: " + lego.getFarba());
        System.out.println("Materiál: " + lego.getMaterial());
        System.out.println("Vekové určenie: " + lego.getVekoveUrcenie());

        //Vytvorime tretiu hracku
        Hracka merkur = new Hracka("kov", "farebné", "3-99", "Merkúr");
        System.out.println(merkur);

        //Vytvorime stvrtu hracku
        Hracka bicykel = new Hracka();
        System.out.println(bicykel);

    }
}
