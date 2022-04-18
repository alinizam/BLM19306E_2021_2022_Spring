/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L10.AbstractFactory;

/**
 *
 * @author ali.nizam
 */
public class ConsumerTest {
    public static void main(String[] args) {
        ICar car=Consumer.createCar(new ConcreateSedanFactroy());
        System.out.println(car);
    }
}
