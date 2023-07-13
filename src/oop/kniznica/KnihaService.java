package oop.kniznica;

import java.util.ArrayList;
import java.util.Scanner;

public class KnihaService {

    public void zobrazMenu() {
        System.out.println("""
                Vyber prosím jednu z možností:
                -----------------------------
                (1) Zadaj novú knihu
                (2) Zobraz všetky knihy
                (3) Zobraz konkrétnu knihu (podľa indexu)
                (4) Vymaž konkrétnu knihu (podľa indexu)
                (5) Zobraz počet všetkých kníh
                (9) Vymaž všetky knihy
                Koniec = skončí zadávanie novej knihy
                """);

    }

    public void pridajKnihu(ArrayList<Kniha> zoznamKnih) {
        // Pouzivatelsky vstup na zadanie udajov knihy
        Scanner scn = new Scanner(System.in);  //Inicializacia konzoly
        System.out.println("Zadaj názov knihy:");
        String nazovKnihy = scn.nextLine();   //Zadanie konkretneho textoveho udaju z konzoly (zadava pouzivatel)

        System.out.println("Zadaj autora danej knihy:");
        String autor = scn.nextLine();

        System.out.println("Zadaj rok vydania:");
        int rokVydania = scn.nextInt();   //Caka na pouzivatelsky vstup, ktory bude cele cislo

        //Vytvorili sme knihu na zaklade pouzivatelskych dat
        Kniha zadanaKniha = new Kniha(nazovKnihy, autor, rokVydania);

        // A nasledne knihu ukladame do ArrayList-u
        zoznamKnih.add(zadanaKniha);
    }


    public void vypisVsetkyKnihy(ArrayList<Kniha> zoznamKnih) {

/*        for (Kniha konkretnaKniha:zoznamKnih) {
            System.out.println(konkretnaKniha);
        }*/

        for (int i = 0; i < zoznamKnih.size() ; i++) {
            System.out.print("Index knihy: " + i);
            System.out.print("\t");   //Pouzijem este tabulator
            System.out.println(zoznamKnih.get(i));  //Detail knihy, ktory riesi metoda toString v Kniha.java
        }
    }

    public void odstranKnihu(ArrayList<Kniha> zoznamKnih) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Zadaj index knihy, ktorú chceš odstrániť?");
        int indexKnihy = scn.nextInt();
        if (potvrdVolbu()) {
            zoznamKnih.remove(indexKnihy); // Odstrani knihu pouzitim metodu remove a index-u
            System.out.println("Kniha je odstránená");
        }
    }

    public Kniha najdiKnihu(ArrayList<Kniha> zoznamKnih) {
    Scanner scn = new Scanner(System.in);
        System.out.println("Zadaj index knihy, ktorú chceš zobraziť");
        int indexKnihy = scn.nextInt();
        return zoznamKnih.get(indexKnihy);
    }

    public int pocetKnih(ArrayList<Kniha> zoznamKnih) {
        return zoznamKnih.size(); // Vrati pocet vsetkych knih, resp. poloziek z ArrayList-u}
    }

    private boolean potvrdVolbu() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Naozaj si praješ koniec? Potvrď (a) ak áno, iný vstup pokračuje ďalej.");
        String odpoved = scn.nextLine();
        if (odpoved.equalsIgnoreCase("a")) return true;
        else return false;
    }

    public void volbaPouzivatela(ArrayList<Kniha> zoznamKnih) {
        String vybrataMenuPolozka = "";
        // Opakujeme volbu pouzivatela
        while (!vybrataMenuPolozka.equals("koniec")) { // Nekonecny cyklus
            //Zobrazujeme menu
            zobrazMenu();
            // Rozhodovanie, co sme si vybrali
            Scanner scn = new Scanner(System.in);
            vybrataMenuPolozka = scn.nextLine().toLowerCase();  // Ocakavame textovu hodnotu (zoberie aj cislo, ale ako text) a zaroven prekonvertuje na malé písmená
            vybrataMenuPolozka = vybrataMenuPolozka.toLowerCase();
            // Logicky blok/
            // Chceme len vypisovat co vybral
            switch (vybrataMenuPolozka.toLowerCase()) {  // "Prekonvertovali" sme String, cize text na male pismena
                case "1" -> {
                    System.out.println("Vybral si číslo 1");
                    pridajKnihu(zoznamKnih);
                }
                case "2" -> {
                    System.out.println("Vybral si číslo 2");
                    vypisVsetkyKnihy(zoznamKnih);
                }
                case "3" -> {
                    System.out.println("Vybral si číslo 3");
                    Kniha najdenaKniha = najdiKnihu(zoznamKnih);
                    System.out.println("Detaily o nájdenej knihe: " + najdenaKniha);
                }

                case "4" -> {
                    System.out.println("Vybral si číslo 4");
                    odstranKnihu(zoznamKnih);
                    // Tu bude pouzivatelsky vstup na zadanie indexu knihy, ktoru ideme zmazat// Ked zadame index knihy, tak pred samotnym mazanim sa vykona metoda potvrdVolbu(scn), vid nizsie}
                }
                case "5" -> {
                    System.out.println("Vybral si číslo 5");
                    System.out.println("Počet všetkých kníh v zozname: " + pocetKnih(zoznamKnih));
                }
                case "koniec" -> {
                    System.out.println("Vybral si koniec");
                    if (potvrdVolbu()) System.exit(1);
                    else vybrataMenuPolozka = "";

                   /* if (odpoved.equalsIgnoreCase("a")) System.exit(0); // System.exit ukonci aplikaciu resp. JVM
                    else vybrataMenuPolozka = "";*/
                    /*if (odpoved.equalsIgnoreCase("a")) return; // Ukončnie programu, resp. metody main bez navratovej hodnoty
                    else vybrataMenuPolozka = "";*/
                }

                default -> System.out.println("Nevybral si nič z menu");
            }
        }
    }

       /* if (vybrataMenuPolozka.equals("1"))
            System.out.println("Vybral si číslo 1");
        else if (vybrataMenuPolozka.equals("2"))
            System.out.println("Vybral si číslo 2");
        else if (vybrataMenuPolozka.equals("3"))
            System.out.println("Vybral si číslo 3");
        else if (vybrataMenuPolozka.equals("koniec"))
            System.out.println("Vybral si koniec");
        else
            System.out.println("Nevybral si nič z menu");*/


    public ArrayList<Kniha> naplnKniznicuKnihami() {

        //Vytvorime prvu ukazkovu knihu, teda objekt kniha1
        Kniha kniha1 = new Kniha("Já, robot", "Isaac Asimov", 1919);
        Kniha kniha2 = new Kniha("1984", "George Orwell", 1915);
        Kniha kniha3 = new Kniha("To Kill a Mockingbird", "Harper Lee", 1982);
        Kniha kniha4 = new Kniha("Maly princ", "Antoine de Saint-Exupéry", 1972);
        Kniha kniha5 = new Kniha("Vládca prsteňov", "J.R.R. Tolkien", 1925);

        //Vytvorenie dynamickeho pola. teda ArrayList-u v ktorom ulozime knihy
        ArrayList<Kniha> zoznamKnih = new ArrayList<>();
        zoznamKnih.add(kniha1);   //Do zoznamKnih, cize do ArrayList-u sme doplnili  knihu
        zoznamKnih.add(kniha2);   //Do zoznamKnih, cize do ArrayList-u sme doplnili  knihu
        zoznamKnih.add(kniha3);   //Do zoznamKnih, cize do ArrayList-u sme doplnili  knihu
        zoznamKnih.add(kniha4);   //Do zoznamKnih, cize do ArrayList-u sme doplnili  knihu
        zoznamKnih.add(kniha5);   //Do zoznamKnih, cize do ArrayList-u sme doplnili  knihu

        return zoznamKnih;

    }

}
