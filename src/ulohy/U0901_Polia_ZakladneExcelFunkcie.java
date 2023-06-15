package ulohy;

import java.util.Arrays;

/*
Úloha na opakovanie: Premenné, cykly a jednoduchý algoritmus na súčet
Vytvorte pole s ľubovoľným počtom čísel (napr. 5-tich), ktorými budeme prechádzať a jednotlivé hodnoty sčítavať, čiže výsledkom bude celkový súčet hodnôt.
Bonusová úloha: Vytvorte metódu (napr. s názvom scitaj() resp. v angličtine getSum()), ktorá bude vracať výsledok po sčítaní.

Bonusová úloha č. 2 (samostatne riešená): Vytvorte metódu priemeruj(), ktorá vypočíta priemer z daných čísiel.
Bonusové úlohy naviac: Vytvorte metódu pocet(), ktorá zistí počet čísel v poli. Zároveň by tam mohla metóda, ktorá zisti najväčšie číslo v poli max(). Analogicky aj metódu min(), ktorá zisti najmenšie číslo v poli.

 */
public class U0901_Polia_ZakladneExcelFunkcie {

    public static double scitaj(double[] cisla) {
        double sum = 0; // Vytvaram premennu sum, ktora reprezentuje sucet a na zaciatku obsahuje 0
        for (double cislo : cisla) {
            sum = sum + cislo; // Interpretujeme vpravo od rovna sa, cize najprv dojde k scitaniu premennych a vysledok sa ulozi do premennej nalavo od rovna sa
            // sum += cislo; // Tento zapis robi presne to iste, co vyssie, cize sum = sum + cislo;
        }
        return sum;
    }

    public static double priemer(double[] cisla) {
        double sum = 0;
        for (double cislo : cisla) {
            sum = sum + cislo;
        }
        return sum / cisla.length;
    }

    public static double pocet(double[] cisla) {
    return cisla.length;
    }

    public static double max(double[] cisla) {
        //Arrays.sort(cisla);             // Zoradi cisla od najmensieho po najvacsie
        double max = cisla[0];
        for (double cislo : cisla) {
            if (max < cislo) max = cislo;
        }
        return max;
        //return cisla[cisla.length-1]; //cisla.length - reprezentuje dlzku pola, ale keďže začíname od nuly, dame -1 pozícia
    }

    public static double min(double[] cisla) {
        /*double min = cisla[0];
        for (double cislo : cisla) {
            if (cislo < min) min = cislo;*/
        Arrays.sort(cisla);

        return cisla[0];
        //return min;
    }

    public static void vypisPoleCezForEach(double[] poleCisel) {
        for (double desatinneCislo : poleCisel) {
            System.out.println(desatinneCislo);
        }
    }

    public static void vypisPole(double[] cisla) {
        for (int i = 0; i < cisla.length; i++) {
            System.out.println(cisla[i]);
        }
    }

    public static void main(String[] args) {
        double[] cisla = {1, 2.5, 4, 8.5, 10}; // Vytvorili sme pole s desatinnymi cislami

        vypisPole(cisla);
        vypisPoleCezForEach(cisla);

        System.out.println("Výsledok scítania pola cisel je: " + scitaj(cisla));
        System.out.println("Priemer pola cisel je: " + priemer(cisla));
        System.out.println("Počet čísel v poli je: " + pocet(cisla));
        System.out.println("Najväčšie číslo v poli je: " + max(cisla));
        System.out.println("Najmenšie číslo v poli je: " + min(cisla));
    }
}