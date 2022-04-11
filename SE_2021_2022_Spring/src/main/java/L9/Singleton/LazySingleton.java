/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L9.Singleton;

import sun.security.jca.GetInstance;

/**
 *
 * @author ali.nizam
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static  LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
