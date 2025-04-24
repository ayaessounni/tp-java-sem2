import java.util.Scanner;
public class ex1{
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
    public static int lecture_x(){
        Scanner sc = new Scanner(System.in);
		int x ;
			System.out.println("entrer en entier :");
            while (!sc.hasNextInt()) {
                System.out.println("ce n'est un entier: ");
               sc.next(); 
            }
			x = sc.nextInt();
		return x;
    }

    public static void remplirTab(int []tab,int n){
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<=n; i++){
            System.out.println("donner T[" +i+ " ]");
            tab[i]=sc.nextInt();
        }

    }
    public static void Remplacer (int[] tab ,int n , int x1 ,int x2){
        for (int i=0;i<=n;i++){
            if(tab[i]==x1){
                tab[i]=x2;
            }
        }
    }
    public static void affichage(int[] tab,int n){
        System.out.println("le tableau est ");
        for (int i=0;i<n;i++){
            System.out.println(tab[i]);
        }
    }
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int n=lecture_n();
        int[] tab=new int[10];
        remplirTab(tab, n);
        System.out.println("donner x1");
        int x1=lecture_x();
        System.out.println("donner x2");
        int x2=lecture_x();
        Remplacer(tab,n,x1,x2);
        affichage(tab, n);
    }
    }

    




    
