package ulohy;

import java.util.Scanner;
public class U0703_ZakladneMatematickeOperacieCezMetodyKonzolvyVstup {

    // Metody ulozim nad metodu main
    public static double scitaj(double cislo1, double cislo2){
        return cislo1 + cislo2;
    }
    public static double modulo(double cislo1, double cislo2){
        return cislo1 % cislo2;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  //Inicializácia Scanner pre vstup z "konzoly"
        System.out.print("Zadaj PRVÉ číslo (a potvrď klávesou enter):");
        double cislo1 = sc.nextDouble();       //Pre konretny pouzivatelsky vstup (desatinne cislo) pouzijeme metodu nextDouble

        System.out.print("Zadaj DRUHÉ číslo (a potvrď klávesou enter):");
        double cislo2 = sc.nextDouble();       //Pre konretny pouzivatelsky vstup (desatinne cislo) pouzijeme metodu nextDouble



        double sum = scitaj(cislo1, cislo2);
        //System.out.println("Sčítanie 2 čísel:" +scitaj(cislo1,cislo2));
        System.out.printf("\nVýsledkom sčítania čisiel %.2f a %.2f je: %.2f", cislo1, cislo2, sum);
        //System.out.printf("\nVýsledkom sčítania čisiel %.2f a %.2f je: %.2f", cislo1, cislo2, scitaj(cislo1,cislo2));

        double modulo = modulo(cislo1, cislo2);
        System.out.printf("\nVýsledkom modulo(zvyšok po delení) čisiel %.2f a %.2f je: %.2f", cislo1, cislo2, modulo);
    }
}
