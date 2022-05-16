/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L13.Observer;

/**
 *
 * @author ali.nizam
 */
public abstract class Observer {
    Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }
    
    abstract void notify(String state);
}
