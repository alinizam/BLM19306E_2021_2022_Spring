/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L11.Adapter;

/**
 *
 * @author ali.nizam
 */
public class Adaptor implements INewPlayer{
    IOldPlayer oldPlayer;
    public Adaptor(IOldPlayer oldPlayer ) {
        this.oldPlayer=oldPlayer;
    }
    
    @Override
    public void playFile() {
       oldPlayer.play();
    }
    
}
