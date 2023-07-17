import java.sql.SQLOutput;

public class Polia {
    public static void main(String[] args) {
        String[] bike;  // prázdne pole
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);        // Vypíše Volvo,nakoľko ráta od 0

        //TODO Ako vypísať obsah poľa
        System.out.println(cars);           // Toto nam nevypíše očakávaný výsledok, čiže celé pole.
        System.out.println(cars.length);


        System.out.println("\nPrvý spôsob ako vypísať obsah poľa");
        //Prvy spôsob s pevným počtom opakovaní
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        System.out.println("\nDruhý spôsob ako vypísať obsah poľa");
        //Druhy spôsob, prostredníctvom foreach
        for(String car:cars) {
            System.out.println(car);
        }
    }
}