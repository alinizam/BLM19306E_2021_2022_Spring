/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L15.State;

/**
 *
 * @author ali.nizam
 */
public class TestClient {
    public static void main(String[] args) {
        Context remoteController=new Context();
        remoteController.setState(new StopState());
        RunningState s=new RunningState();
        s.nextState(remoteController);
        System.out.println(remoteController.getState().getClass());
    }
}
