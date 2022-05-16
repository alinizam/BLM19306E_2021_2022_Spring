/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L13.Observer;

/**
 *
 * @author ali.nizam
 */
public class TestClient {
    public static void main(String[] args) {
        Subject s=new ConcreateSubject();
        Observer click=new ClickConcreateObserver(s);
        Observer keystroke=new KeyStrokeConcreateObserver(s);
        s.setState("Clicked");
    }
}
