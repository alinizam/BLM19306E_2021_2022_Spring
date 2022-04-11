/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L9.Singleton;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {  
        System.out.println(EagerSingleton.getInstance());
        System.out.println(EagerSingleton.getInstance());
       
        
        System.out.println(LazySingleton.getInstance());
        System.out.println(LazySingleton.getInstance());
    }
}
