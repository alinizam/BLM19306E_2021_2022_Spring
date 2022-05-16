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
public class ChatMediatorImpl implements ChatMediator{
    ArrayList<User> users=new ArrayList();
    @Override
    public void sendMessage(User u, String message) {
       u.receiveMassage(message);
    }

    @Override
    public void addUser(User u) {
        users.add(u);
    }
    
}
