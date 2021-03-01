import java.util.Scanner;

public class Exemple2 {

    final static double PI=3.1416;
     public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrer le rayon: ");
        double rayon = clavier.nextDouble();
       
        double perimetre = 2 * PI * rayon;
        System.out.print("Le périmètre vaut: "+ perimetre );

        
    }

}
