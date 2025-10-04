package tp2.java;

public class MatriceMagique {
    public static boolean estMagique(int[][] matrice) {
        int n = 3;
        int somme = 0;
        for (int j = 0; j < n; j++) {
            somme += matrice[0][j];
        }

        for (int i = 1; i < n; i++) {
            int sommeLigne = 0;
            for (int j = 0; j < n; j++) {
                sommeLigne += matrice[i][j];
            }
            if (sommeLigne != somme) return false;
        }

        for (int j = 0; j < n; j++) {
            int sommeCol = 0;
            for (int i = 0; i < n; i++) {
                sommeCol += matrice[i][j];
            }
            if (sommeCol != somme) return false;
        }

        int diag1 = 0, diag2 = 0;
        for (int i = 0; i < n; i++) {
            diag1 += matrice[i][i];
            diag2 += matrice[i][n - 1 - i];
        }
        if (diag1 != somme || diag2 != somme) return false;

        return true;
    }

    public static void main(String[] args) {
        int[][] matrice = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
        };

        System.out.println(estMagique(matrice)); 
    }
}
