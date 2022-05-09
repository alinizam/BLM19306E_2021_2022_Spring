/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L12.ChainOfResponsibility;

/**
 *
 * @author ali.nizam
 */
public class TestClient {
    public static void main(String[] args) {
        Handler c=new GeneralManager(new Employee(new Manager(null)));
        Request r=new Request("Task",5000);
        c.handleRequest(r);
    }
}
