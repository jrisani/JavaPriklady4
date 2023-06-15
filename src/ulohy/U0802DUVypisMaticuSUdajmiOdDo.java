package ulohy;

public class U0802DUVypisMaticuSUdajmiOdDo {
    public static void main(String[] args) {

        for (int cislo = 1; cislo <= 25; cislo++) {
            if (cislo % 5 == 0 ) {
                System.out.print("" +cislo+ ",\n");
            } else {
                System.out.print("" +cislo+",");
            }
        }

        for (int cislo = 1; cislo <= 25; cislo++) {
            if (cislo % 5 == 0 ) {
                System.out.print("" +cislo+ " \n");
            } else {
                System.out.print("" +cislo+" ");
            }
        }

        // podľa ChatGPT :)
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

    }
}