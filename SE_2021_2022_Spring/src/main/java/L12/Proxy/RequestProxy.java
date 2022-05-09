/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L12.Proxy;

/**
 *
 * @author ali.nizam
 */
public class RequestProxy implements ISecurity {

    @Override
    public void callOperation(String userName, String password) {
        if (securityControl(userName, password)) {
            WebRequest r = new WebRequest();
            r.callOperation(userName, password);
        } 
    }

    boolean securityControl(String userName, String password) {
        if (userName.equals("Ahmet") && password.equals("Ak")) {
            System.out.println("Connected");
            return true;
        }
        System.out.println("User error.");
        return false;

    }

}
