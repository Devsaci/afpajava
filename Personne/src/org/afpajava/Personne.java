package org.afpajava;

import java.util.regex.Pattern;

public class Personne {

    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[\\w.-]+@[\\w.-]+[a-z]{2,}$"  );

    private int identifier;
    private String firstName;
    private String lastName;
    private String email;
    private String adresse;
    private String ville;


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
        if ( identifier < 0 )  {
            throw new RuntimeException( "identifier must be positive" );
        }
        this.identifier = identifier;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if ( firstName == null ) {
            throw new NullPointerException( "firstName cannot be null" );
        }
        firstName = firstName.trim();   // Pour supprimer les blancs inutiles
        if ( firstName.equals( "" ) ) {
            throw new RuntimeException( "firstName cannot be empty" );
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if ( lastName == null ) {
            throw new NullPointerException( "lastName cannot be null" );
        }
        lastName = lastName.trim();   // Pour supprimer les blancs inutiles
        if ( lastName.equals( "" ) ) {
            throw new RuntimeException( "lastName cannot be empty" );
        }
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if ( email == null ) {
            throw new NullPointerException( "email cannot be null" );
        }
        if ( ! EMAIL_PATTERN.matcher( email ).matches() ) {
            throw new RuntimeException( "email parameter not match with classical pattern" );
        }
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

//    @Override
//    public String toString() {
//        return "Personne{" +
//                "identifier=" + identifier +
//                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", email='" + email + '\'' +
//                ", adresse='" + adresse + '\'' +
//                ", ville='" + ville + '\'' +
//                '}';
//    }

    @Override public String toString() {
        return String.format( "%d: %s %s @ %s",
                this.identifier,
                this.firstName,
                this.lastName,
                this.email );
    }
}
