/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L12.FlyWeigth;

/**
 *
 * @author ali.nizam
 */
public class ClientTest {
    public static void main(String[] args) {
        Shape s=new Rectangle();
        s.setColor("Blue");
        System.out.println(ColorFactory.colors);
        
        Shape s1=new Square();
        s1.setColor("Blue");
        System.out.println(ColorFactory.colors);
        
        Shape s2=new Rectangle();
        s2.setColor("Red");
        System.out.println(ColorFactory.colors);
        
        Shape s3=new Rectangle();
        s3.setColor("Red");
      System.out.println(ColorFactory.colors);
        
        Shape s4=new Rectangle();
        s4.setColor("Yellow");
        System.out.println(ColorFactory.colors);
    }
}
