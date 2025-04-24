import java.util.Scanner;

public class ex3 {

    public static int lecture_n() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Entrer un entier strictement positif :");
            while (!sc.hasNextInt()) {
                System.out.println("Ce n'est pas un entier :");
                sc.next();
            }
            n = sc.nextInt();
        } while (n <= 0);
        return n;
    }

    public static void remplirTab(int[] t, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            int val;
            do {
                System.out.print("T[" + i + "] = ");
                while (!sc.hasNextInt()) {
                    System.out.println("Ce n'est pas un entier :");
                    sc.next();
                }
                val = sc.nextInt();
            } while (val < 0);
            t[i] = val;
        }
    }

    public static int[] creerTpair(int[] t, int n) {
        int p = 0;
        for (int i = 0; i < n; i++) {
            if (t[i] % 2 == 0) {
                p++;
            }
        }

        int[] tPair = new int[p];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (t[i] % 2 == 0) {
                tPair[index++] = t[i];
            }
        }
        return tPair;
    }

    public static int[] creerTimpair(int[] t, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (t[i] % 2 != 0) {
                count++;
            }
        }

        int[] tImpair = new int[count];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (t[i] % 2 != 0) {
                tImpair[index++] = t[i];
            }
        }
        return tImpair;
    }

    public static void afficherTableau(int[] tab, String nom) {
        System.out.print(nom + " : ");
        for (int val : tab) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n = lecture_n();
        int[] t = new int[n];
        remplirTab(t, n);

        int[] tPair = creerTpair(t, n);
        int[] tImpair = creerTimpair(t, n);

        afficherTableau(t, "Tableau original");
        afficherTableau(tPair, "Tableau pair");
        afficherTableau(tImpair, "Tableau impair");
    }
}


