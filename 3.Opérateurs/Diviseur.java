import java.util.Scanner;

public class Diviseur {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrer N1: ");
        double N1= clavier.nextDouble();
        System.out.println("Entrer N2: ");
        double N2= clavier.nextDouble();
        if (N2 == 0){
            System.out.println("La valeur de N2 doit etre differente de zero");
        }else{
            System.out.println("le quotion  de la division de  : "+N1+" par "+N2+" est "+(N1/N2));
        }
        
    }
}
