import java.util.Scanner;

public class Additionneur {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrer N1: ");
        double N1= clavier.nextDouble();
        System.out.println("Entrer N2: ");
        double N2= clavier.nextDouble();
        System.out.println("la somme de : "+N1+" et "+N2+" est "+(N1+N2));


        
    }
}
