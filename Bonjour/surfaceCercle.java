import java.util.Scanner;

public class surfaceCercle {
    

    final static double PI=3.1416;
    public static void main(String[] args) {
       Scanner clavier = new Scanner(System.in);
       System.out.println("Entrer le rayon: ");
       double rayon = clavier.nextDouble();
       System.out.print("La surface  vaut: "+ ( PI * rayon*rayon ));

       
   }
}
