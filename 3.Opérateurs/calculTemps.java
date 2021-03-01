import java.util.Scanner;

public class calculTemps {

    public static void main(String[] args){
        concertisseurTemps();  
    }


    
/* Fonction de Converssion*/ 
    public static void concertisseurTemps(){
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrer une durée en seconde: ");
        int n = clavier.nextInt();
        int nJour = n/86400;
        int nHeure = (n%86400)/3600;
        int nMinute= ((n%86400)%3600) /60;
        int nSeconde =(((n%86400)%3600)%60);
        System.out.println();
        System.out.print("Equivalent à  "+ nJour+ " Jour(s),"+nHeure+
        "  heure(s), "+nMinute+"  minute(s), et "+nSeconde+" seconde(s). ");
  }

  
}
