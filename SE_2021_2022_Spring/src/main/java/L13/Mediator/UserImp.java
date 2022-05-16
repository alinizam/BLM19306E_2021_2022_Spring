/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L13.Mediator;

/**
 *
 * @author ali.nizam
 */
public class UserImp extends User{

    public UserImp(ChatMediator m) {
        super(m);
    }
    
    @Override
    void sendMassage(String message, User u) {
        u.inputBox.add(message);
        m.sendMessage(u, message);
    }

    @Override
    void receiveMassage(String message) {
        
    }
    
}
