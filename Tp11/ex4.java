import java.util.Scanner;
public class ex4 {
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
    public static int calculSomme(int[][] tab, int n, int i) {
        if (i < 0 || i >= n) {
            System.out.println("Indice de ligne invalide.");
            return -1;
        }
    
        int somme = 0;
        for (int j = 0; j < tab[i].length; j++) {
            somme += tab[i][j];
        }
        return somme;
    }
    public static void main(String[] args) {
        int n = lecture_n();
        int[] t = new int[n];
        remplirTab(t, n);
    
        System.out.print("Tableau saisi : ");
        for (int val : t) {
            System.out.print(val + " ");
        }
        System.out.println();
    }   
}
