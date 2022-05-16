/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L13.Mediator;

/**
 *
 * @author ali.nizam
 */
public class ClientTest {
    public static void main(String[] args) {
        ChatMediator chatRoom=new ChatMediatorImpl();
        User u1=new UserImp(chatRoom);
        User u2=new UserImp(chatRoom);
        u1.sendMassage("Hello", u2);
        u1.sendMassage("How are you", u2);
        
        System.out.println(u2.inputBox);
    }
}
