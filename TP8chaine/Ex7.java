 import java.util.Scanner;
 public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        String verb,radical;
        do{
            System.out.println("entrez un verbe");
            verb=scanner.nextLine();      
        }while(!verb.endsWith("er") ||  verb.equals("aller"));
        System.out.println("je "+ verb.replace("er","e"));
        System.out.println("tu "+ verb.replace("er","es"));
        System.out.println("il/elle "+ verb.replace("er","e"));
        if(verb.equals("manger")){
        System.out.println("nous "+ verb.replace("er","eons"));
    } else if (verb.equals("commencer")){
     System.out.println("nous "+ verb.replace("er","çons"));}
     
    System.out.println("vous "+ verb.replace("er","ez"));
        System.out.println("ils/elles "+ verb.replace("er","ent"));
    }
}
    
