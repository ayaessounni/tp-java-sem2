import java.util.Scanner;
public class EX2 {
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

	public static void main(String[] args) {
		int n = lecture_n();
		System.out.println("le nombre de chiffre de " + n + " est " + compter(n));	

	}

}

