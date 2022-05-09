/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L12.Proxy;

/**
 *
 * @author ali.nizam
 */
public class TestClient {
    public static void main(String[] args) {
        ISecurity r=new RequestProxy();
        r.callOperation("Ahmet", "Beyaz");
        r.callOperation("Ahmet", "Ak");
    }
}
