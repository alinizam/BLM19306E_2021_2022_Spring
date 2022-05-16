/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L13.Observer;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
abstract class  Subject {
    String state;
    ArrayList<Observer> observers=new ArrayList();
    abstract void setState(String state);
    abstract void notifyObserver(String state) ;
    void addObserver(Observer o){
        observers.add(o);
    }
    
}
