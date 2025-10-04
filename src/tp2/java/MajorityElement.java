package tp2.java;

import java.util.Scanner;

public class MajorityElement {
    public static int trouverMajoritaire(int[] tab) {
        int candidat = 0;
        int compteur = 0;

        for (int num : tab) {
            if (compteur == 0) {
                candidat = num;
                compteur = 1;
            } else if (num == candidat) {
                compteur++;
            } else {
                compteur--;
            }
        }

        compteur = 0;
        for (int num : tab) {
            if (num == candidat) {
                compteur++;
            }
        }

        if (compteur > tab.length / 2) {
            return candidat;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez la taille du tableau : ");
        int n = sc.nextInt();
        int[] tab = new int[n];

        System.out.println("Entrez les éléments du tableau :");
        for (int i = 0; i < n; i++) {
            tab[i] = sc.nextInt();
        }

        int majoritaire = trouverMajoritaire(tab);
        if (majoritaire != -1) {
            System.out.println("L'élément majoritaire est : " + majoritaire);
        } else {
            System.out.println("Aucun élément majoritaire.");
        }
    }
}
