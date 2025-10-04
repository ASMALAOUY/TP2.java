package tp2.java;

import java.util.Scanner;

public class Pivot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau : ");
        int n = sc.nextInt();
        int[] t = new int[n];

        System.out.println("Entrez les valeurs du tableau : ");
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }

        
        int[] maxGauche = new int[n];
        int[] minDroite = new int[n];

        
        maxGauche[0] = t[0];
        for (int i = 1; i < n; i++) {
            maxGauche[i] = Math.max(maxGauche[i-1], t[i]);
        }

        
        minDroite[n-1] = t[n-1];
        for (int i = n-2; i >= 0; i--) {
            minDroite[i] = Math.min(minDroite[i+1], t[i]);
        }

        
        System.out.print("Pivots : ");
        for (int i = 0; i < n; i++) {
            if (t[i] >= maxGauche[i] && t[i] <= minDroite[i]) {
                System.out.print(t[i] + " ");
            }
        }
    }
}
