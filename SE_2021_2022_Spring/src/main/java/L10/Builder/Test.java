/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L10.Builder;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Employee e=new Employee.Builder().setFirstName("Ahmet").setSalary(1000).build();
        System.out.println(e.firstName+" "+ e.lastName+ " "+e.salary);
        
        
        Employee e1=new Employee.Builder().setSalary(15000).setFirstName("Ahmet").setLastName("Ak").build();
        System.out.println(e1.firstName+" "+ e1.lastName+ " "+e1.salary);
        
    } 
}
