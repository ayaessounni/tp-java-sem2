
import java.util.Scanner;

public class Ex1 {
   public Ex1() {
   }

   static int lecture_n() {
      Scanner sc = new Scanner(System.in);

      int n;
      do {
         System.out.println("entrer en entier n :");
         n = sc.nextInt();
      } while(n <= 0);

      return n;
   }

   static Boolean estpair(int n) {
      return n % 2 == 0 ? true : false;
   }

   public static void main(String[] args) {
      int n = lecture_n();
      if (estpair(n)) {
         System.out.println("" + n + " est pair ");
      } else {
         System.out.println("" + n + " est impair ");
      }

   }
}
