package oop;

public class EvidenciaVozidiel {
    public static void main(String[] args) {
        Auto Audi = new Auto();
        Audi.model = "Q5";
        Audi.farba = "biele";
        Audi.km = 120000;
        Audi.nazov = "Audi";

        Auto VW = new Auto();
        VW.model = "Passat";
        VW.farba = "modré";
        VW.km = 55000;
        VW.nazov = "VW";

        Auto Skoda = new Auto();
        Skoda.model = "Enyaq";
        Skoda.farba = "zelené";
        Skoda.km = 32000;
        Skoda.nazov = "Škoda";

        System.out.println("Názov značky: " + Audi.VypisZnacku());
        System.out.println("Model vozidla: " + Audi.model);
        System.out.println("Farba vozidla:" + Audi.farba);
        System.out.println("Najazdené km: " + Audi.km);

        System.out.println("");  //Prázdny riadok

        System.out.println("Názov značky: " + VW.VypisZnacku());
        System.out.println("Model vozidla: " + VW.model);
        System.out.println("Farba vozidla:" + VW.farba);
        System.out.println("Najazdené km: " + VW.km);

        System.out.println("");  //Prázdny riadok

        System.out.println("Názov značky: " + Skoda.VypisZnacku());
        System.out.println("Model vozidla: " + Skoda.model);
        System.out.println("Farba vozidla:" + Skoda.farba);
        System.out.println("Najazdené km: " + Skoda.km);
    }
}
