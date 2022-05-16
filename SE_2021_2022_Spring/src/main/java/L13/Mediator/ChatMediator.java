/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L13.Mediator;

/**
 *
 * @author ali.nizam
 */
public interface ChatMediator {
   void sendMessage(User u,String message);
   void addUser(User u);
}
