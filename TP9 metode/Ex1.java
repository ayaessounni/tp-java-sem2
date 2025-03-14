 import java.util.Scanner;
 public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] entiers = new int[10];

        // Lecture des 10 entiers
        System.out.println("Entrez 10 entiers strictement positifs : ");
        for (int i = 0; i < 10; i++) {
            entiers[i] = Method.lectureN(sc);
        }

        // Affichage des nombres pairs
        System.out.print("Les entiers pairs sont : ");
        for (int n : entiers) {
            if (Method.EstPair(n)) {
                System.out.print(n + " ");
            }
        }
        sc.close();
    }

}

    

