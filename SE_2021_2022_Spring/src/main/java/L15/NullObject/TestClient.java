/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L15.NullObject;

/**
 *
 * @author ali.nizam
 */
public class TestClient {
    public static void main(String[] args) {
        CustomerFactory f=new CustomerFactory();
        Customer c=f.getCustomer(0);
        System.out.println(c.account);
        System.out.println(c);
    }
}
