/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L15.State;

/**
 *
 * @author ali.nizam
 */
public class RemoteControlBeforeStatePattern {
    String state;
    void changeStete(String newState){
        if (newState.equals("Stop") && this.state.equals("running")){
            state="Stop";
        }else if (newState.equals("running") && this.state.equals("Stop")){
            state="Stop";
        }
    }
}
