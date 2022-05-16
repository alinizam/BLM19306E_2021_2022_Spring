/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L13.Momento;

/**
 *
 * @author ali.nizam
 */
public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
        
    Momento storeState(){
        return new Momento(this.state);
    }
    
    void getBackState(Momento m){
        state=m.getState();
    }
}
