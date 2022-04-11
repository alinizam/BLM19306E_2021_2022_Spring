/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L9.Factory;

/**
 *
 * @author ali.nizam
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(getProduct("Car"));
    }

    static Product getProduct(String type) {
        Product p=null;
        if (type.equals("Car")) {
            p= new Car();
        } else if (type.equals("Bycle")) {
            p= new Bycle();
        }
       return new Car();
    }
}