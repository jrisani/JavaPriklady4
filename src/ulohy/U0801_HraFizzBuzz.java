package ulohy;

import java.util.Scanner;

/*Hra
Hráči zvyčajne sedia v kruhu. Prvý hráč povie číslo "1" a každý ďalší hráč povie číslo o jedno vyššie od predošlého. Akékoľvek číslo deliteľné tromi musí hráč nahradiť slovom fizz a akékoľvek číslo deliteľné piatimi slovom buzz. Čísla deliteľné oboma sa nahrádzajú slovami fizz buzz. Hráč, ktorý zaváha alebo urobí chybu je vylúčený z hry.
Typická hra fizz buzz môže začínať takto:

1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, Fizz Buzz, 31, 32, Fizz, 34, Buzz, Fizz, …
https://sk.wikipedia.org/wiki/Fizz_buzz

 */
public class U0801_HraFizzBuzz {
    public static void main(String[] args) {
        final int MAX = 100; // Konstanta je deklarovaná prostredníctvom kľúčového slova final
        // MAX = 99;   // Konštantu nemožno hodnotovo prepisat

       /* Scanner sc = new Scanner(System.in);
        System.out.println("Zadaj číslo po ktoré sa bude hrať FizzBuzz");
        int vstup = sc.nextInt();

        */


        for (int cislo = 1; cislo <= /*vstup*/MAX; cislo++) {
            if (cislo % 15 == 0 ) {
                System.out.print(" FizzBuzz,");
            } else if (cislo % 3 == 0) {
                System.out.print(" Fizz,");
            } else if (cislo % 5 == 0) {
                System.out.print(" Buzz,");
            } else {
                System.out.print(" " +cislo+",");
            }
        }

    }
}