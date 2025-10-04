package tp2.java;

import java.util.Scanner;

public class MatriceSpirale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la taille n de la matrice : ");
        int n = sc.nextInt();

        int[][] matrice = new int[n][n];

        int haut = 0, bas = n - 1, gauche = 0, droite = n - 1;
        int valeur = 1;

        while (haut <= bas && gauche <= droite) {
 
            for (int i = gauche; i <= droite; i++) {
                matrice[haut][i] = valeur++;
            }
            haut++;

            for (int i = haut; i <= bas; i++) {
                matrice[i][droite] = valeur++;
            }
            droite--;

            if (haut <= bas) {
                for (int i = droite; i >= gauche; i--) {
                    matrice[bas][i] = valeur++;
                }
                bas--;
            }

            if (gauche <= droite) {
                for (int i = bas; i >= haut; i--) {
                    matrice[i][gauche] = valeur++;
                }
                gauche++;
            }
        }

        System.out.println("Matrice spirale :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrice[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
