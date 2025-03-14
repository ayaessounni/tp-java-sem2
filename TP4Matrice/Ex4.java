import java.util.Scanner;
public class Ex4 {
    public static void main (String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Entrer la taille du tableau :");

      int n;
      for(n = sc.nextInt(); n < 0; n = sc.nextInt()) {
         System.out.println("Entrer la taille du tableau :");
      }

      int[][] m = new int[n][n];

      int i;
      int j;
      for(i = 0; i < n; ++i) {
         for(j = 0; j < n; ++j) {
            System.out.println("remplir  de case [" + i + "," + j + "] :");
            m[i][j] = sc.nextInt();
         }
      }

      boolean ok = true;

      for(i = 0; i < n; ++i) {
         for(j = 0; j < n; ++j) {
            if (m[i][j] != m[i][j]) {
               ok = false;
               break;
            }
         }
      }

      if (ok) {
         System.out.println("symetrique ");
      } else {
         System.out.println(" non symetrique ");
      }
    }
}
