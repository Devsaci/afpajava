import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        afficheTriangle();

    }

    private static void afficheTriangle() {
        Scanner sc = new Scanner(System.in);
        int nbLignes;
        System.out.println("Quel taille?");
        nbLignes = sc.nextInt();

        for (int i = 1; i < nbLignes+1; i++){
            System.out.println(" ".repeat(nbLignes - i) +"*".repeat(2 * i - 1));
        }

    }


}
