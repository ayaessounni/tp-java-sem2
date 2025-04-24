import java.util.Scanner;

public class ex2 {

    public static int lecture_n() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("entrer un entier n :");
            while (!sc.hasNextInt()) {
                System.out.println("ce n'est pas un entier : ");
                sc.next();
            }
            n = sc.nextInt();
        } while (n <= 0); 
        return n;
    }

    public static void remplirTab(int[] tab, int n) {
        Scanner sc = new Scanner(System.in);
        int note;
        for (int i = 0; i < n; i++) { 
            do {
                System.out.println("donner la note :");
                note = sc.nextInt();
            } while (note < 0 || note > 20); 
            tab[i] = note;
        }
    }

    public static double calcul_Moy(int[] tab, int n) {
        int somme = 0;
        double moy; 
        for (int i = 0; i < n; i++) {
            somme += tab[i];
        }
        moy = (double) somme / n;
        return moy;
    }

    public static int NombreNote(int[] tab, int n, double moy) {
        int compteur = 0;
        for (int i = 0; i < n; i++) {
            if (tab[i] > moy) {
                compteur += 1;
            }
        }
        return compteur;
    }

    public static void afichage(int[] tab, int n) {
        System.out.println("le tableau :");
        for (int i = 0; i < n; i++) {
            System.out.println(tab[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = lecture_n();
        int[] tab = new int[100];
        remplirTab(tab, n);
        double moy = calcul_Moy(tab, n); 
        int nb = NombreNote(tab, n, moy); 
        afichage(tab, n);
        System.out.println("La moyenne est : " + moy);
        System.out.println("Nombre de notes supérieures à la moyenne : " + nb);
    }
}
