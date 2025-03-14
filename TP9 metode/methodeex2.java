import java.util.Scanner;

public class methodeex2 {
    static int lecture_n() {
		Scanner sc = new Scanner(System.in);
		int n ;
		do {
			System.out.println("entrer en entier n :");
			n = sc.nextInt();
		}while(n <= 0);
		return n ; 
	}
	static int compter(int n){
		int s  =  0 ;
		while (n != 0) {
			s ++ ;
			n = n / 10 ;
		}
		return s ;
	}
}
