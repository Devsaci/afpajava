package org.afpajava;

public class Emplyee extends Personne{
private double salary;

    public Emplyee() {
        super();
   
    }

    public Emplyee(int identifier, String firstName, String lastName, String email,
                   String adresse, String ville, double salary) {
        super(identifier, firstName, lastName, email, adresse, ville);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<0)
            throw new RuntimeException("Salary > 0");
        this.salary = salary;
    }
}
