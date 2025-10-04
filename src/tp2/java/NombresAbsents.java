package tp2.java;


import java.util.*;

public class NombresAbsents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau : ");
        int n = sc.nextInt();
        int[] tab = new int[n];

        System.out.println("Entrez les éléments du tableau :");
        for (int i = 0; i < n; i++) {
            tab[i] = sc.nextInt();
        }

        boolean[] present = new boolean[n + 1];
        for (int num : tab) {
            if (num <= n) {
                present[num] = true;
            }
        }

        System.out.print("Nombres absents : ");
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                System.out.print(i + " ");
            }
        }
    }
}


