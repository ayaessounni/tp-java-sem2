import java.util.Scanner;
public class app3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nc,nl,j,i;
    int [][] M =new int[30][20];
    int [] T =new int[20];
    do{
        System.out.println("donner le nombre de ligne");
        nl =sc.nextInt();
        System.out.println("donner le nombre de colonne");
        nc =sc.nextInt();
    }
    while(nl < 20 && nc>30 );
    for (i=0; i<nl;i++){
        for (j=0; j<nc; j++){
            System.out.println("remplir M[" + i + "," +j+ "]=");
            M[i][j] = sc.nextInt();
        }
    }
    int sommax=0; int sommin=999;
    int somme =0;
    for (i=0;i<nl;i++){
        somme=0;
        for(j=0;j<nc;j++){
            somme +=M[i][j];
        }
        T[i]=somme;
        if(sommax < somme){
            sommax=somme;
        }
        if(sommin > somme){
            sommin=somme;
        }
    }
    System.out.println("la somme = " + somme);
    for (i=0;i<nl;i++){
        System.out.println("la somme de ligne" +i+ "=" + T[i]);
    }
    System.out.println("la somme minimale=" + sommin);
    System.out.println("la somme maximale=" + sommax);
    sc.close();
}
}
    
    
