import java.util.Scanner;
public class ex4{
    static int lecture_n() {
        Scanner sc = new Scanner(System.in);
  
        int n;
        do {
           System.out.println("Entrer un entier n :");
           n = sc.nextInt();
        } while(n <= 0);
  
        sc.close();
        return n;
     }
  
     static boolean estArmstrong(int n) {
        int original = n;
  
        int sum;
        for(sum = 0; n > 0; n /= 10) {
           int digit = n % 10;
           sum = (int)((double)sum + Math.pow((double)digit, 3.0));
        }
  
        return sum == original;
     }
  
     public static void main(String[] args) {
        int n = lecture_n();
        if (estArmstrong(n)) {
           System.out.println("" + n + " est un nombre Armstrong.");
        } else {
           System.out.println("" + n + " n'est pas un nombre Armstrong.");
        }
  
     }
  }
  