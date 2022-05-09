/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L12.ChainOfResponsibility;

/**
 *
 * @author ali.nizam
 */
public abstract class Handler {

    Handler processor;

    public Handler(Handler processor) {
        this.processor = processor;
    }

    void handleRequest(Request r) {
        if (processor != null) {
            this.processor.handleRequest(r);
        }
    }

}
