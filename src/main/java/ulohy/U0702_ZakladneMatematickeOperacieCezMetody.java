package ulohy;

public class U0702_ZakladneMatematickeOperacieCezMetody {

    // Metody ulozim nad metodu main
    public static double scitaj(double cislo1, double cislo2){
        return cislo1 + cislo2;
    }
    public static double modulo(double cislo1, double cislo2){
        return cislo1 % cislo2;
    }
        public static void main(String[] args) {
            double cislo1 = 7;
            double cislo2 = 3;
            double sum = scitaj(cislo1, cislo2);
            //System.out.println("Sčítanie 2 čísel:" +scitaj(cislo1,cislo2));
            System.out.printf("Výsledkom sčítania čisiel %.2f a %.2f je: %.2f", cislo1, cislo2, sum);
            //System.out.printf("\nVýsledkom sčítania čisiel %.2f a %.2f je: %.2f", cislo1, cislo2, scitaj(cislo1,cislo2));

            double modulo = modulo(cislo1, cislo2);
            System.out.printf("\nVýsledkom modulo(zvyšok po delení) čisiel %.2f a %.2f je: %.2f", cislo1, cislo2, modulo);
    }
}
