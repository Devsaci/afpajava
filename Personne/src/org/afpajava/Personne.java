package org.afpajava;

import java.util.regex.Pattern;

public class Personne {



    private int identifier;
    private String firstName;
    private String lastName;
    private String email;
    private String adresse;
    private String ville;

//    public Personne() {
//        this( 0, "john", "doe", "unknown@anywhere.unk"," rue Ottawa","Ottawa");
//    }


    public Personne() {
        this( 0, "john", "doe", "unknown@anywhere.unk"," rue Ottawa","Ottawa");
    }

    public Personne(int identifier, String firstName, String lastName, String email, String adresse, String ville) {
        this.identifier = identifier;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.adresse = adresse;
        this.ville = ville;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
