import java.util.Scanner;
public class EX3 {
    static int lecture_n(){
        Scanner sc=new Scanner(System.in);
        int n;
        do{
            System.out.println("donner un nombre positive n:");
            n=sc.nextInt();

        }
        while(n<=0);
        return n;
    }
    static int calculeSomme(int n){
        int s=0;
        for (int i = 1 ; i <= n ; i++) {
			s = (int) (s + Math.pow(i, 2));
			
		}
		return s ; 
	}

	public static void main(String[] args) {
		int n = lecture_n();
		System.out.println("la somme de " + n + " premiers carrés est " + calculeSomme(n));

	}

}

