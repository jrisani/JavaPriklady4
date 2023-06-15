package ulohy;
/*
Úloha na opakovanie: Vypíš maticu s údajmi od 1 do 25
Vytvorte (vypíšte) maticu údajov do konzoly, ktoré budú vyzerať nasledovne:
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25

Bonusová úloha: Vytvorte obdobnú maticu, ktorá bude obsahovať 2-násobok tej predchádzajúcej hodnoty (začneme 1), takže bude to vyzerať nasledujúco:

1 2 4 8 16
32 64 128 256 512
1024 2048 4096 8192 16384
atď.
 */
public class U0802DUVypisMaticuSUdajmiOdDo {
    public static void main(String[] args) {

        for (int cislo = 1; cislo <= 25; cislo++) {
            if (cislo % 5 == 0 ) {
                System.out.print(" " +cislo+ "\n");
            } else {
                System.out.print(" " +cislo+"");
            }
        }

        for (int cislo = 1; cislo <= 25; cislo++) {
            if (cislo % 5 == 0 ) {
                System.out.print("" +cislo+ " \n");
            } else {
                System.out.print("" +cislo+"\t");
            }
        }

     /*   // podľa ChatGPT :)
        int rows = 5;
        int columns = 5;
        int counter = 1;

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = counter++;
            }
        }

        // Výpis matice
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
            //Bonus
            int rowsb = 5;
            int columnsb = 5;
            int value = 1;

            int[][] matrixb = new int[rowsb][columnsb];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columnsb; j++) {
                    matrixb[i][j] = value;
                    value *= 2;
                }
            }

            // Výpis matice
            for (int i = 0; i < rowsb; i++) {
                for (int j = 0; j < columnsb; j++) {
                    System.out.print(matrixb[i][j] + " ");
                }
                System.out.println();
            }
*/
    }
}