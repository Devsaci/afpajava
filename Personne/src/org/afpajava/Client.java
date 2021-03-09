package org.afpajava;

public class Client extends Personne {

    private String enterpriseName;


    public Client() {
        super();
        this.setEnterpriseName( null );
    }

    public Client( int identifier, String firstName, String lastName, String email,String adresse,String ville ,String enterpriseName ) {
        super( identifier, firstName, lastName, email,adresse,ville);
//        ,adresse,ville
        this.setEnterpriseName( enterpriseName );
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    @Override
    public String toString() {
        return super.toString() + " -travail à " + this.getEnterpriseName();
    }
}
