/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L7.LiskovSubsitution;

/**
 *
 * @author ali.nizam
 */
public class Employee extends Person{
    int salary;

    public int getSalary() {
        return salary;
    }
    
    public String getTravelType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
