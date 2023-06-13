import java.util.Scanner;

public class VarPriklad {
    public static void main(String[] args) {

        var cislo = 10;         // Toto môže spôsobiť "nečitateľnosť" kodu
        System.out.println("Zadefinoval si cislo: " + cislo);

        var nejakyText = "vyborny";
        var spolu = nejakyText + cislo;       // je možné spájať rôzne typi premennej
        System.out.println("Spolu je:" + spolu);

        Scanner sc = new Scanner(System.in);       //Inicializácia Scanner-a
        System.out.println("Zadaj nieco: ");
        var vstupZKonzoly = sc.nextLine();


        System.out.println(vstupZKonzoly);
    }
}
