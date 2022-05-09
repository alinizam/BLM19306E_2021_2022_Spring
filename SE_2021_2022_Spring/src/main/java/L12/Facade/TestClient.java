/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L12.Facade;

/**
 *
 * @author ali.nizam
 */
public class TestClient {
    public static void main(String[] args) {
        SubSystem1 s1=new SubSystem1();
        s1.function1();
        SubSystem2 s2=new SubSystem2();
        s2.function2();
    }
}
