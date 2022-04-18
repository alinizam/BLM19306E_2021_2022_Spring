/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L10.Prototype;

/**
 *
 * @author ali.nizam
 */
public class TestClient {

    public static void main(String[] args) {
        System.out.println(ShapeStore.getPrototype("black rectangle").color);
        System.out.println(ShapeStore.getPrototype("white rectangle"));
        System.out.println(ShapeStore.getPrototype("black rectangle"));
        System.out.println(ShapeStore.getPrototype("triangle"));
        
    }
}
