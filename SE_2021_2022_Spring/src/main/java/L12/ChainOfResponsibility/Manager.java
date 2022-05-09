/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L12.ChainOfResponsibility;

/**
 *
 * @author ali.nizam
 */
public class Manager extends Handler {

    public Manager(Handler processor) {
        super(processor);
    }

    @Override
    void handleRequest(Request r) {
        if (r.cost >= 10000 && r.cost <= 100000) {
            System.out.println("Manager has done");
        } else {
            super.handleRequest(r);
        }
    }
}
