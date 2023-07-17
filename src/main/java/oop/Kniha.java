package oop;

public class Kniha {
    // Atributy triedy, premenne triedy, fields
    public String nazov;
    public String autor;
    public int rokVydania;
    public int pocetStran;
    public double cena;
    public String hodnotenie;
    public String vydavatelstvo;


    public void pozdrav() {
        System.out.println("Ahoj, ja som vytvorený objekt kniha, čiže naozajstná kniha!" + nazov);
        System.out.println("Autorom knihy je:" + autor);
        //return "Ahoj, ja som vytvorený objekt kniha, čiže naozajstná kniha!";
    }
}
