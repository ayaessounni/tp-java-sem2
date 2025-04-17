import java.util.Scanner;
public class ex2 {
    public static double addition(double a,double b){
        return a+b;
    }
    public static double soustraction(double a,double b){
        return a-b;
    }
    public static double multiplication(double a,double b){
        return a*b;
    }
    public static double division (double a,double b){
        if (b==0){
            System.out.println("erreur:division par zéro:");
        return Double.NaN;
        }
    return a/b;
    }
    public static void main (String[] args){
        Scanner sc =new Scanner (System.in);
        System.out.println("donner la premier nombre");
        double a=sc.nextInt();
        System.out.println("donner la dexieme nombre");
        double b=sc.nextInt();
        System.out.println("les opèration (+,-,*,/)");
        char op=sc.next().charAt(0);
    
    double result=0;
    switch(op){
        case '+':
        result=addition(a, b);
        break;
        case '-':
        result=soustraction(a, b);
        break;
        case '*':
        result=multiplication(a, b);
        break;
        case '/':
        result=division(a, b);
        break;
        default:
        System.out.println("opération invalid");
        return;
    }
    System.out.println("les opération ;" +result);

    }
}
    
