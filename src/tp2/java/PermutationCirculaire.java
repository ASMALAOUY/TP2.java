package tp2.java;

import java.util.Scanner;

public class PermutationCirculaire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la taille n : ");
        int n = sc.nextInt();
        int[] t = new int[n];

        System.out.println("Entrez les éléments du tableau :");
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }

        if (estPermutationCirculaire(t, n)) {
            System.out.println("Valide : permutation circulaire");
        } else {
            System.out.println("Invalide");
        }
    }

    static boolean estPermutationCirculaire(int[] t, int n) {
        boolean[] vu = new boolean[n + 1];

        for (int x : t) {
            if (x < 1 || x > n || vu[x]) return false;
            vu[x] = true;
        }

        int pos1 = -1;
        for (int i = 0; i < n; i++) {
            if (t[i] == 1) {
                pos1 = i;
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            int attendu = i + 1;
            int idx = (pos1 + i) % n;
            if (t[idx] != attendu) return false;
        }

        return true;
    }
}
