
import java.util.Scanner;

public class Bonjour{
    public static void main(String[] arg) {
	    System.out.println("Bonjour! Qui etes vous?");

        Scanner sc = new Scanner(System.in);
        String nom = sc.next();
        System.out.println("Bonjour  "+nom);
    }
}