package oop.konstruktory;

public class Hracka {
    //materiál, veľkosť, farba, cena, vek, nazov

    private String material;
    private String farba;
    private double cena;
    private String vekoveUrcenie;
    private String nazov;

    // Vytvorili sme konstruktor bez parametrov
    public Hracka() {
        nazov = "Žiadny";
        farba = "-";
        // Definovanie, čo napísať, keď nevyplním žiadnu hodnotu, pre vybraný parameter. Teda pre material keď nič neuvediem.
        material = "Výrobca neuvádza"; // V prípade žiadneho zobrazenia textu sa používajú dve úvodzovky ""
        // material = "";               // Zobrazí sa "prázdny" text
        vekoveUrcenie = "Výrobca neuvádza";
        cena = 10.00;
    }
    // Konštruktor s parametrami - preťažený konštruktor
    // Ak mame min. 2 konstruktory, ktore sa lisia poctom parametrov, resp. jeden z nich je bez parametrov, tak im hovorime aj, ze su pretazene
    public Hracka(String material, String farba, double cena, String vekoveUrcenie, String nazov) {
        this.material = material;
        this.farba = farba;
        this.cena = cena;
        this.vekoveUrcenie = vekoveUrcenie;
        this.nazov = nazov;
    }
    //Konstruktor s niekolkymi parametrami, vynechana cena
    public Hracka(String material, String farba, String vekoveUrcenie, String nazov) {
        this.material = material;
        this.farba = farba;
        this.vekoveUrcenie = vekoveUrcenie;
        this.nazov = nazov;
        this.cena = 10.00;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getFarba() {
        return farba;
    }

    public void setFarba(String farba) {
        this.farba = farba;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getVekoveUrcenie() {
        return vekoveUrcenie;
    }

    public void setVekoveUrcenie(String vekoveUrcenie) {
        this.vekoveUrcenie = vekoveUrcenie;
    }
    // Vypisanie buď jeden sposob - cez Generate - > toString a to co je pod komentom, alebo upravena verzia nizšie od 91 riadku
    /*@Override
    public String toString() {
        return "Hracka{" +
                "material='" + material + '\'' +
                ", farba='" + farba + '\'' +
                ", cena=" + cena +
                ", vekoveUrcenie='" + vekoveUrcenie + '\'' +
                ", nazov='" + nazov + '\'' +
                '}';
    }*/

    @Override
    public String toString() {
        return "Informácie o hračke: \nMateriál: " + material + " \nFarba: " + farba + " \nCena: " + cena + " \nvekové určenie " + vekoveUrcenie + " \nNázov: " + nazov;
    }
}
