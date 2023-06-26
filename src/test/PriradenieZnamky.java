package test;

import java.util.Scanner;

public class PriradenieZnamky {
    public static String hodnot (int percenta) {
        String slovnaZnamka = "";
        if (percenta >= 90) {
            slovnaZnamka = "A";
        } else if (percenta >= 75 && percenta < 90) {
            slovnaZnamka = "B";
        } else if (percenta >= 65 && percenta < 75) {
            slovnaZnamka = "C";
        } else if (percenta >= 0 && percenta < 65) {
            slovnaZnamka = "Fx";
        } else
            slovnaZnamka = "Neočakávaná vstupná hodnota";
        return slovnaZnamka;

    }


    public static void main(String[] args) {
        int percenta = 0;
        int sum = 0;
        int pocet = 0;

        Scanner sc = new Scanner(System.in);

        while (percenta >=0){
            System.out.println("Zadaj percentá: ");
            percenta = sc.nextInt();

            if (percenta >= 0) {
                sum += percenta;
                pocet++;
            }
            hodnot(percenta);
        }
            System.out.println("Priemer známok je: " + (sum / pocet ));
            System.out.println("Koniec programu");
}
}