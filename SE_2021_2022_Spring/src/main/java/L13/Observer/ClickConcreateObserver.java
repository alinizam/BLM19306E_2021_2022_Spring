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
public class ClickConcreateObserver extends Observer{

    public ClickConcreateObserver(Subject subject) {
        super(subject); 
    }
    
    
    String state;
    ArrayList<Observer> observers=new ArrayList();
    void setState(String state){
        this.state=state;
        notifyObserver(state);
    }

    private void notifyObserver(String state) {
        for (Observer observer : observers) {
            observer.notify(state);
        }
    }
    @Override
    void notify(String state) {
        this.state=state;
    }
    
}
