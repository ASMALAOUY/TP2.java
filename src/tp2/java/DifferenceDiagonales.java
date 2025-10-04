package tp2.java;
import java.util.Scanner;

public class DifferenceDiagonales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez la taille n de la matrice : ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        System.out.println("Entrez les éléments de la matrice :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int diff = diagonaleDiff(mat, n);
        System.out.println("Valeur absolue de la différence = " + diff);
    }

    static int diagonaleDiff(int[][] mat, int n) {
        int sommePrincipale = 0;
        int sommeSecondaire = 0;

        for (int i = 0; i < n; i++) {
            sommePrincipale += mat[i][i];
            sommeSecondaire += mat[i][n - 1 - i];
        }

        return Math.abs(sommePrincipale - sommeSecondaire);
    }
}
