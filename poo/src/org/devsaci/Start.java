package org.devsaci;



public class Start {


public static void main(String[] args) {
      Rationnal r = new Rationnal();
    System.out.printf(  "[%d/%d]\n", r.getNumerator(),r.getDenominator());
      r.setNumerator(2);
      r.setDenominator(5);
//      double result = r.getNumerator()/ r.getDenominator();
    System.out.printf(  "r   [%d/%d]\n", r.getNumerator(),r.getDenominator());

    Rationnal r1 = new Rationnal();
    System.out.printf(  "r1  [%d/%d]\n", r1.getNumerator(),r1.getDenominator());
    
    Rationnal r2 = new Rationnal(5,3);
    System.out.printf(  "r2  [%d/%d]\n", r2.getNumerator(),r2.getDenominator());

;
System.out.println(r2.toString());
  }


}
