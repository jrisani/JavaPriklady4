package ulohy;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

/*
Vytvorte jednoduchý program, ktorého cieľom bude výpočet 5 základných matematických operácií a to sčítanie (+), odčítanie (-), násobenie (*) a delenie (/), modulo (%).
        Matematické operácie budú “narábať” s dvoma hodnotami, ktoré budú zadané v premenných, napr. cislo1  a cislo2.


        Pozn.: Nezabúdať na to, že sa môže jednať o desatinné čísla.
        Program nám zároveň vypíše takýto text:
        Výsledkom sčítania hodnôt 2 a 3 je 5.
        Výsledkom odčítania hodnôt 2 a 3 je -1.
        atď.
        Bonusová úloha: Vedeli by ste v prípade desatinných miest nahradiť desatinnú bodku za čiarku?
        Pomôcka:
// Ako naformatovat cislo v SK formate na 2 desatinne miesta, pouzijeme %.2f
        System.out.printf("Desatinné číslo naformátované ako desatinná čiarka %.2f", desatinneCislo);
        Bonusová úloha č.2: Vstup hodnôt by mohol byť cez konzolu, čiže Scanner.

 */

public class U0701_ZakladneMatematickeOperacie {
    // Moje vlastné metódy
    public static float sucet(float a, float b, float scitanie){
        return a + b;
    }
    public static float rozdiel(float a, float b){
        return a - b;
    }
    public static float nasob(float a, float b){
        return a * b;
    }
    public static float delenie(float a, float b){
        return a / b;
    }
    public static float modulo(float a, float b){
        return a % b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // vytvorenie objektu


            //nacitam si dve cisla a zvolim operaciu

            System.out.print("Zadaj prvé číslo: ");
            double a = sc.nextFloat();            //nextFloat berie aj čiarku ","
            System.out.print("Zadaj druhé číslo: ");
            double b = sc.nextFloat();
            double vysledok = 0;

        vysledok = a + b;
        System.out.printf("Vysledok sčítania hodnôt je %.2f", vysledok);
        System.out.println("");
        vysledok = a - b;
        System.out.printf("Vysledok odčítania je %.2f", vysledok);
        System.out.println("");
        System.out.printf("Vysledok násobenia je %.2f", a*b);
        vysledok = a / b;
        System.out.printf("\nVysledok delenia je %.2f", vysledok);
        vysledok = a % b;
        System.out.printf("\nVysledok modulo je %.2f", vysledok);

        // Escape characters:
        // \n   reprezentuje vypis na dalsi riadok
        // \t   reprezentuje tabulator
        // \'   zobrazi apostrof
        // \"   zobrazi uvodzovky
        // \\   zobrazi lomku

        //  TODO Zobrazit akykolvek text, v ktorom sa nachadzaju uvodzovky.
        //  TODO Priklad - vypíš do konzoly tento text: Táto hora je "vraj" najvyššia!
        System.out.println("\nTáto hora je \"vraj\" najvyššia!");

        double cislo1 = 25;
        double cislo2 = 12;
        double sum = U0702_ZakladneMatematickeOperacieCezMetody.scitaj(cislo1, cislo2);
        System.out.printf("\nVýsledkom sčítania čisiel %.2f a %.2f je: %.2f", cislo1, cislo2, sum);

        //GitHub Copilot - platena funkcia - dopise celu sekvenciu kodu podla zadania

        }
}
