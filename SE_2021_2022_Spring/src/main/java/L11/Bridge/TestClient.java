/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L11.Bridge;

/**
 *
 * @author ali.nizam
 */
public class TestClient {
    public static void main(String[] args) {
        Shape rectangle=new Rectange(new ColorBlue());
        rectangle.colorObject();
        Shape rectangle1=new Rectange(new ColorGreen());
        rectangle1.colorObject();
        
        Shape triangle=new Triangle(new ColorGreen());
        triangle.colorObject();
    }
}
