/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L13.Mediator;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public abstract class User {
    ChatMediator m;
    ArrayList<String> inputBox=new ArrayList();

    public User(ChatMediator m) {
        this.m = m;
    }
    
   abstract void  sendMassage(String message, User u);
   abstract void  receiveMassage(String message);
    
}
