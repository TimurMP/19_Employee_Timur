package telran.employee.model;

import java.util.Objects;

public abstract class Emloyee {
    protected static double minWage = 30;
    protected final int id;
    protected String firstName;
    protected String lastName;
    protected double hours;

    public Emloyee(int id, String firstName, String lastName, double hours) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hours = hours;
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

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public int getId() {
        return id;
    }



    public static double getMinWage() {
        return minWage;
    }

    public static void setMinWage(double minWage) {
        Emloyee.minWage = minWage;
    }

    @Override
    public String toString() {
        return "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + calcSalary();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Emloyee other = (Emloyee) obj;
        return id == other.id;
    }

    public abstract double calcSalary();







}
