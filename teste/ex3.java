import java.util.Scanner;
public class ex3{
public static boolean estInf(String verbe) {
    return verbe.endsWith("er") || verbe.endsWith("ir") || verbe.endsWith("re") || verbe.endsWith("oir");
}

public static String Groupe(String verbe) {
    if (verbe.equals("aller")) return "Troisième groupe";
    if (verbe.endsWith("er")) return "Premier groupe";
    if (verbe.endsWith("ir")) {
        String radical = verbe.substring(0, verbe.length() - 2);
        return "Deuxième groupe (si participe présent en -issant)";
    }
    return "Troisième groupe";
}

public static String demanderVerbe() {
    Scanner sc = new Scanner(System.in);
    String verbe;
    do {
        System.out.print("Entrez un verbe à l'infinitif : ");
        verbe = sc.nextLine().toLowerCase();
    } while (!estInf(verbe));
    return verbe;
}

public static void main(String[] args) {
    String verbe = demanderVerbe();
    String groupe = Groupe(verbe);
    System.out.println("Le verbe \"" + verbe + "\" est du " + groupe);
}
}


