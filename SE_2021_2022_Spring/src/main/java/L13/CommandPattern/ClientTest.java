/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L13.CommandPattern;

/**
 *
 * @author ali.nizam
 */
public class ClientTest {
    public static void main(String[] args) {
        Light l=new Light();
        l.lightOn();
        
        
        Command command=new LightOn(l);
        command.execute();
        System.out.println(l.getState());
        
    }
}
