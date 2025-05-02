import java.util.Scanner;
public class app1 {
    public static int lecture_n(){
        Scanner sc = new Scanner(System.in);
		int n ;
		do {
			System.out.println("entrer en entier n :");
            while (!sc.hasNextInt()) {
                System.out.println("ce n'est un entier: ");
               sc.next(); 
            }
			n = sc.nextInt();
		}while(n <= 0);
		return n ; 
	}
   public static double somme(double [] tab){
    double total=0;
    for(int i=0;i<tab.length;i++){
        total += tab[i];
    }
    return total;
   }
   public static void incre(double[] tab,double n){
    for(int i=0;i<tab.length;i++){
        tab[i]+=n;
    }
   }
   public static void afficher(double[] tab){
    for(int i=0;i<tab.length;i++){
        System.out.println(tab[i]+"");
    }
    System.out.println();
   }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double[] montab={1.5,2.0,3.5};
    somme(montab);
    double n=lecture_n();
    incre(montab, n);
    System.out.println("tableau aprés incrémentation :");
    afficher(montab);
   }
}