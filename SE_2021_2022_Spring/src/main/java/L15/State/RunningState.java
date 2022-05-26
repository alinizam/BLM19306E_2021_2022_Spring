/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L15.State;

/**
 *
 * @author ali.nizam
 */
public class RunningState implements  State{

    @Override
    public void nextState(Context c) {
        c.state=new RunningState();
    }
    
}
