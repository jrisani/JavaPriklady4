package oop.rozhranie;

public class Naklad implements INaklad {

    @Override
    public void vypis() {
        // Konkretna implementacia danej metody
        System.out.println("Vyopisujem konkrétne údaje o náklade");

    }

    @Override
    public void vytlac() {

    }

    @Override
    public void zoznamNaklad() {

    }

    @Override
    public double celkoveNaklady() {
        return 0;
    }

    @Override
    public void exportDoPDF() {

    }
}
