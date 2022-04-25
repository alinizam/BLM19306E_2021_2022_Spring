/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L11.Composite;

/**
 *
 * @author ali.nizam
 */
public class TestClient {
    public static void main(String[] args) {
        ManagerComposite composite=new ManagerComposite();
        composite.addEmployee(new Developer());
        composite.addEmployee(new Developer());
        composite.addEmployee(new Analist()); 
        ManagerComposite m1= new ManagerComposite();
        m1.addEmployee(new Developer());
        composite.addEmployee(m1);
        
        composite.increaseSalary(10);
        
        
    }
}
