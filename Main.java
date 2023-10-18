public class Main {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;

        Fraction[][] matrixA = new Fraction[rows][columns];
        Fraction[][] matrixB = new Fraction[rows][columns];

        // Mengisi matriks A dan B dengan pecahan
        matrixA[0][0] = new Fraction(1, 2);
        matrixA[0][1] = new Fraction(3, 4);
        matrixA[0][2] = new Fraction(1, 6);
        matrixA[1][0] = new Fraction(2, 3);
        matrixA[1][1] = new Fraction(5, 6);
        matrixA[1][2] = new Fraction(7, 8);
        matrixA[2][0] = new Fraction(1, 4);
        matrixA[2][1] = new Fraction(1, 2);
        matrixA[2][2] = new Fraction(3, 4);

        matrixB[0][0] = new Fraction(2, 3);
        matrixB[0][1] = new Fraction(1, 5);
        matrixB[0][2] = new Fraction(3, 4);
        matrixB[1][0] = new Fraction(1, 4);
        matrixB[1][1] = new Fraction(1, 3);
        matrixB[1][2] = new Fraction(1, 2);
        matrixB[2][0] = new Fraction(1, 2);
        matrixB[2][1] = new Fraction(3, 5);
        matrixB[2][2] = new Fraction(1, 3);

        Fraction[][] resultMatrix = new Fraction[rows][columns];

        // Menambahkan dua matriks pecahan
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrixA[i][j].addFractions(matrixB[i][j]);
            }
        }

        System.out.println("Matriks A:");
        printFractionMatrix(matrixA);

        System.out.println("Matriks B:");
        printFractionMatrix(matrixB);

        System.out.println("Hasil penjumlahan matriks:");
        printFractionMatrix(resultMatrix);
    }

    // Method untuk mencetak matriks pecahan dengan simbol "[ ]"
    public static void printFractionMatrix(Fraction[][] matrix) {
        System.out.println("");
        for (Fraction[] row : matrix) {
            System.out.print("  [ ");
            for (Fraction cell : row) {
                System.out.print(cell.getNumerator() + "/" + cell.getDenominator() + " ");
            }
            System.out.println("]");
        }
        System.out.println("");
    }
}