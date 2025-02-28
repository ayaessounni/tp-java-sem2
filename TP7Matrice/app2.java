import java.util.Scanner;
public class app2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nl,nc;
        int[][] M=new int[30][30];
        System.out.println("donner le nombre de ligne");
        nl=sc.nextInt();
        while (nl>30) {
            System.out.println("donner le nombre de ligne");
            nl=sc.nextInt();   
        }
        System.out.println("donner le nombre de colonne");
        nc=sc.nextInt();
        while (nc>30){
            System.out.println("donner le nombre de colonne");
            nc=sc.nextInt();
        }
        System.out.println("remplir le Matrice :");
        for (int i = 0; i<nl ;i++){
            for (int j = 0; j<nc ;j++){
              System.out.println(" M[" + i + "," + j + " ]=");
                M[i][j]=sc.nextInt();
            } 
        }
        int somme =0;
        double moyenne;
         long produit=1;
        int nb=nl*nc;
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                somme += M[i][j];
                produit *= M[i][j];
            }
        }
                moyenne = (double) somme / nb;
                System.out.println("Matrice saisie :");
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                System.out.print("M[i][j]");
            }
            System.out.println();
        }
            System.out.println("Somme des éléments : " + somme);
        System.out.println("Produit des éléments : " + produit);
        System.out.println("Moyenne des éléments : " + moyenne);
    }
    }
  

 