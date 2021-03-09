package org.afpajava;

public class Main {

    public static void main(String[] args) {
Personne james = new Personne(0,"james", "bond","jame@mail.uk","rue Ottawa","Ottawa");
    System.out.println(james);
    Emplyee emp =new Emplyee(1,"albert","Dupain","albDup@mail"," rue Ottawa","Ottawa",100000);
//    emp.getEmail();
        System.out.println(emp.toString());


        Client aClient = new Client();
        aClient.setIdentifier( 0 );
        aClient.setFirstName( "client1" );
        aClient.setLastName( "CLIENT1" );
        aClient.setEmail( "client1@mail.com" );

        System.out.println( aClient );

    }
}
