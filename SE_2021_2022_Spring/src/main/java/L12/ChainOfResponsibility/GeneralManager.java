/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L12.ChainOfResponsibility;

/**
 *
 * @author ali.nizam
 */
public class GeneralManager extends Handler{
     public GeneralManager(Handler processor) {
        super(processor);
    }

    @Override
    void handleRequest(Request r) {
        if (r.cost>100000){
            System.out.println("General manager has done");
        }else {
            super.handleRequest(r);
        }
    }
     
}
