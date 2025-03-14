import java.util.Scanner;
public class EX3 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
      System.out.println("Entrer la taille du tableau :");

      int n1;
      for(n1 = sc.nextInt(); n1 < 0; n1 = sc.nextInt()) {
         System.out.println("Entrer la taille du tableau :");
      }

      System.out.println("Entrer la taille du tableau :");

      int n2;
      for(n2 = sc.nextInt(); n2 < 0; n2 = sc.nextInt()) {
         System.out.println("Entrer la taille du tableau :");
      }

      int[][] m = new int[n1][n2];

      int i;
      int j;
      for(i = 0; i < n1; ++i) {
         for(j = 0; j < n2; ++j) {
            System.out.println("remplir  de case [" + i + "," + j + "] :");
            m[i][j] = sc.nextInt();
         }
      }

      int s = 0;
      int p = 0;

      for(i = 0; i < n1; ++i) {
         for(j = 0; j < n2; ++j) {
            s += m[i][j];
            p *= m[i][j];
         }
      }

      double moy = (double)(s / (n1 * n2));
      System.out.println(moy);
      System.out.println(p);
      System.out.println(s);
   }
}

