package oop.encapsulation;

public class EvidenciaVydavkov {
    public static void main(String[] args) {
        Vydavok chlieb = new Vydavok();
        chlieb.setNazov("Chlieb");
        chlieb.setCena(1.90);
        chlieb.setKategoria("Potraviny");


        //Vypis obsah objektu chlieb
        System.out.println("Názov chleba: " + chlieb.getNazov());
        System.out.println("Cena: " + chlieb.getCena());
        System.out.println("Kategoria: " + chlieb.getKategoria());
        //System.out.println("DPH na chlieb je: " + chlieb.DPH * 100 + "%");
        System.out.println("DPH na chlieb je: " + Vydavok.DPH * 100 + "%");
    }
}
