/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L11.Composite;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class ManagerComposite implements IEmployee{
    double salary=10000;
    ArrayList<IEmployee> employees=new ArrayList();
    
    void addEmployee(IEmployee e){
       employees.add(e);
    }
     
    @Override
    public void increaseSalary(double ratio) {
        salary+=salary*ratio/100;
        for (IEmployee employee : employees) {
            employee.increaseSalary(ratio);
            System.out.println(employee + " " + employee.getSalary());
        }
    }

    @Override
    public double getSalary() {
        return salary;
    }
    
    
    
    
}
