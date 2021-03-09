package org.afpajava;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//Personne james = new Personne(0,"james", "bond","jame@mail.uk","rue Ottawa","Ottawa");
//    System.out.println(james);
//    Emplyee emp =new Emplyee(1,"albert","Dupain","albDup@mail"," rue Ottawa","Ottawa",100000);
////    emp.getEmail();
//        System.out.println(emp.toString());
//
//
//        Client aClient = new Client();
//        aClient.setIdentifier( 0 );
//        aClient.setFirstName( "client1" );
//        aClient.setLastName( "CLIENT1" );
//        aClient.setEmail( "client1@mail.com" );
//
//        System.out.println( aClient );



        // Plymorphisme

        ArrayList<Personne> personnes = new ArrayList<>();
        personnes.add( new Personne());
        personnes.add( new Emplyee( 1, "empl", "EMPL", "supremacy@mail.us","ville","adress" ,10_000 ) );
        personnes.add( new Client( 7, "clent1", "CLENT1", "clent1@mail.uk", "ENTREP" ) );
        for( Personne person : personnes ) {
            System.out.println( person );
        }
    }
}
