/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L10.AbstractFactory;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        AbstractCarFactory factory=new ConcreateSedanFactroy();
        ICar car=factory.createCar();
        System.out.println(car.toString());
        
        AbstractCarFactory factorySport=new ConcreateSportFactory();
        ICar sportCar=factorySport.createCar();
        System.out.println(sportCar);
    }
}
