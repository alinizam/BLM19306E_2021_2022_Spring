/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L12.ChainOfResponsibility;

/**
 *
 * @author ali.nizam
 */
public class Employee extends Handler {

    public Employee(Handler processor) {
        super(processor);
    }

    @Override
    void handleRequest(Request r) {
        if (r.cost < 10000) {
            System.out.println("Employee has done");
        } else {
            super.handleRequest(r);
        } // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
