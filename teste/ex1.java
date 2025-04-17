import java.util.Scanner;
public class ex1{
    static int lecture_n(){
        Scanner sc=new Scanner(System.in);
        int n;
        do{
        System.out.println("donner un entier strictement positif :");
        while (!sc.hasNextInt()) {
            System.out.println("ce n'est pas entier donner un entre entier  :"); 
            sc.next(); 
        }
        n=sc.nextInt();}
        while (n<=0);
        return(n);
    }
static int  compter(int n){
    int s=0;
    while(n!=0){
        s++;
        n=n/10;
    }
    return s;
}
public static void main (String[]args){
    int n= lecture_n();
    int s= compter(n);
    System.out.println("le nombre de chiffre de " + n + " est " + s);	

}
}



