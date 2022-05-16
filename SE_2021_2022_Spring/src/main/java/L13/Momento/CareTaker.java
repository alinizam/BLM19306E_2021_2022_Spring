/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L13.Momento;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class CareTaker {
    ArrayList<Momento> states=new ArrayList();
    
    void addState(Momento m){
        states.add(m);
    }
    
    Momento getState(int i){
        return states.get(i);
    }
}
