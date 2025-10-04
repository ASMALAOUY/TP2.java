package tp2.java;

import java.util.Scanner;

public class LTS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau (≤ 1000) : ");
        int n = sc.nextInt();
        int[] t = new int[n];

        System.out.println("Entrez les valeurs du tableau : ");
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }

        System.out.println("Longueur de la plus longue sous-suite croissante = " + lis(t, n));
    }

    public static int lis(int[] t, int n) {
        int[] dp = new int[n];
        int max = 1;

        for (int i = 0; i < n; i++) {
            dp[i] = 1   ; 
            for (int j = 0; j < i; j++) {
                if (t[j] < t[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(max, dp[i]);
        }

        return max;
    }
}


