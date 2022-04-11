/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L9.Singleton;

/**
 *
 * @author ali.nizam
 */
public class EagerSingleton {
    private static EagerSingleton instance;

    public static EagerSingleton getInstance() {
        return instance;
    }
    private EagerSingleton() {
    }
    
    static{
        instance=new EagerSingleton();
    }
    
}
