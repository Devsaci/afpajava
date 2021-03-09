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
        System.out.println( "Personne");
        System.out.println( "******************************************** ");
        Personne toto = new Personne(0,"toto","TOTO","toto@mail","adresstoto","villetoto");
        System.out.println( toto );
        System.out.println( "******************************************** ");
        System.out.println( "Emplyee");
        Emplyee empl = new Emplyee(1, "empl", "EMPL", "supremacy@mail.us","ville","adress" ,10_000 );
        System.out.println( empl );
        System.out.println( "******************************************** ");
        System.out.println( "Client");
        Client client = new Client(7, "clent1", "CLENT1", "clent1@mail.uk","ville","adress", "ENTREP" );
        System.out.println( client );
        System.out.println( "******************************************** ");
        System.out.println( "ArrayList");



        ArrayList<Personne> personnes = new ArrayList<>();
        personnes.add( new Personne(0,"toto","TOTO","toto@mail","adresstoto","villetoto"));
        personnes.add( new Emplyee( 1, "empl", "EMPL", "supremacy@mail.us","ville","adress" ,10_000 ) );
        personnes.add( new Client( 7, "clent1", "CLENT1", "clent1@mail.uk", "ville","adress","ENTREP" ) );
        for( Personne person : personnes ) {
            System.out.println( person );
        }
        System.out.println( "*****************END*************** ");
    }

}
