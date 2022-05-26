/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L15.Strategy;

/**
 *
 * @author ali.nizam
 */
public class TestClient {
    public static void main(String[] args) {
        Context c=new Context();
        c.x=10;
        c.y=5;
        c.writeArea(new RectangleArea());
        c.writeArea(new TriangleArea());
          
    }
}
