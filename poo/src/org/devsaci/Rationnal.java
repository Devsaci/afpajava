package org.devsaci;

public class Rationnal {

private int numerator;
private int denominator;


    public Rationnal() {
    }

    public Rationnal(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }


    public int getNumerator() {
        return this.numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void setDenominator(int denominator) {
        if ( denominator == 0 ) throw new RuntimeException( "denominator cannot be zero" );
        this.denominator = denominator;
    }


    @Override
    public String toString() {
        return "{" +
            " numerator='" + getNumerator() + "'" +
            ", denominator='" + getDenominator() + "'" +
            "}";
    }




}


