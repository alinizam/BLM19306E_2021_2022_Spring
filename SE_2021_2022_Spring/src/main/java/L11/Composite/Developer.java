/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L11.Composite;

/**
 *
 * @author ali.nizam
 */
public class Developer implements IEmployee{
    double salary=5000;
  
    @Override
    public void increaseSalary(double ratio) {
        salary+=salary*ratio/100;
    }
    @Override
    public double getSalary() {
        return salary;
    }
    
}
