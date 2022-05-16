/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L13.Momento;

/**
 *
 * @author ali.nizam
 */
public class TestClient {

    public static void main(String[] args) {
        Originator o = new Originator();
        o.setState("state1");
        Momento m = o.storeState();
        System.out.println(m.state);
        CareTaker c = new CareTaker();
        c.addState(m);

        o.setState("state2");
        Momento m1 = o.storeState();
        c.addState(m1);
       
        o.setState("state3");
        o.setState("state4");
        Momento m2 = o.storeState();
        c.addState(m2);
        
         System.out.println("---------------");
        for (Momento momento : c.states) {
            System.out.println(momento.getState());
        } 

    }
}
