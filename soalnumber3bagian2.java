import java.util.Scanner;

public class soalnumber3bagian2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("PENJUMLAHAN MATRIKS 3x3");
        
        int[][] matriksA = new int[3][3];
        int[][] matriksB = new int[3][3];
        int[][] hasil = new int[3][3];
        
        // Input matriks A
        System.out.println("Masukkan elemen matriks A (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                matriksA[i][j] = scanner.nextInt();
            }
        }
        
        // Input matriks B
        System.out.println("Masukkan elemen matriks B (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                matriksB[i][j] = scanner.nextInt();
            }
        }
        
        // Penjumlahan matriks
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }
        
        // Output hasil
        System.out.println("\nHasil Penjumlahan:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
 