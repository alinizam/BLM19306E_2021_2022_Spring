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
public class ConcreateSubject extends Subject{
 
    @Override
    void setState(String state){
        this.state=state;
        notifyObserver(state);
    }

    void notifyObserver(String state) {
        for (Observer observer : observers) {
            observer.notify(state);
            System.out.println(observer +" notified");
        }
    }
}
