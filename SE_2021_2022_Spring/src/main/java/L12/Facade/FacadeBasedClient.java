/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L12.Facade;

/**
 *
 * @author ali.nizam
 */
public class FacadeBasedClient {
    public static void main(String[] args) {
        Facade f=new Facade();
        f.callSubsystem();
        
        Facade2_3 f2_3=new Facade2_3();
        f2_3.callSubsystem();
    }
}
