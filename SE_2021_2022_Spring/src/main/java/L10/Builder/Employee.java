/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L10.Builder;

/**
 *
 * @author ali.nizam
 */
public class Employee {

    String firstName, lastName;
    int salary;

    public Employee(Builder b) {
        this.firstName = b.firstName;
        this.lastName = b.lastName;
        this.salary = b.salary;
    }

    static class Builder {

        private String firstName, lastName;
        private int salary;

        Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        Builder setSalary(int salary) {
            this.salary = salary;
            return this;
        }

        Employee build() {
            Employee e = new Employee(this);
            return e;
        }

    }

    /*public Employee(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public Employee(String firstName) {
        this.firstName = firstName;
 
    }*/
}
