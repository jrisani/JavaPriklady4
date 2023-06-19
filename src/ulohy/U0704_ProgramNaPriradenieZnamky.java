package ulohy;

import java.util.Scanner;

/*   Úloha 1: Program na priradenie známky

        Vytvorte prostredníctvom vstupu z konzoly rozhodovací test, ktorý vypíše známku A, B alebo C podľa týchto kritérií:
        Ak je percento nad 90, tak vypíše známku A
        Ak je percento nad 75, tak vypíše známku B
        Ak je percento nad 65, tak vypíše známku C
        Použite metódu pre rozhodovanie.

        HINT: Použitie príkazu if

 */

//TODO Vytvorit "nekonečny pouzivatelsky vstup na zadavanie a vyhodnotenie znamok
public class U0704_ProgramNaPriradenieZnamky {
    public static void main(String[] args) {
        int percenta = 0;
        int sum = 0;
        int priemer = 0;
        int pocet = 0;

        Scanner sc = new Scanner(System.in);


        while (percenta >= 0) {
            //while (true) {
            System.out.print("Zadaj percenta [%](Pri zadani záporného čísla sa program ukončí): ");
            percenta = sc.nextInt();

            if (percenta > 0) {
                //sum = sum + percenta;             // pripocitavame percenta k povodnemu sumaru, cize sum
                sum += percenta;
                pocet++;                            // Obsah premennej pocet zvysime o 1
            }
            // && pouzijeme pri podminekach, ktore musia platit zaroven (AND)
            // || pouzijeme pri podmienkach, pri ktorych staci, ked plati jedna z nich (OR) - Pipe vo Win je Alt Gr + Q
            // TODO Vytvorit metodu s nazvom hodnot, ktora vrati zodpovedajucu znamku na zaklade vstupnej hodnoty
            // TODO Otestovat metodu `hodnot` prostrednictvom jUnit testov, pripravit testovacie scenare
            if (percenta >= 90) {
                System.out.println("Tvoja známka je A");
            } else if (percenta >= 75 && percenta < 90) {
                System.out.println("Tvoja známka je B");
            } else if (percenta >= 65 && percenta < 75) {
                System.out.println("Tvoja známka je C");
  /*          } else if (percenta < 0) {
               // break;          //Stopneme nekonečný vyklus, pokial while(true)*/       //tento riadok v pripade cez true
            } else if (percenta >= 0 && percenta < 65)
                System.out.println("Neuspel");
            else
                System.out.println("Neočakávaná vstupná hodnota");
        }

        System.out.println("Priemer známok je: " +(sum/pocet));
        System.out.println("Koniec programu");
 /*       for (;;)  { //nekonecny cyklus
            System.out.print("Zadaj percenta [%]: ");
            int percenta = sc.nextInt();

            if (percenta > 90) {
                System.out.println("Tvoja známka je A");
            } else if (percenta > 75) {
                System.out.println("Tvoja známka je B");
            } else if (percenta > 65) {
                System.out.println("Tvoja známka je C");
            } else if (percenta < 0) {
                break;          //Stopneme nekonečný vyklus, pokial while(true)
            }else
                System.out.println("Neuspel");
            }

  */


    }

}

