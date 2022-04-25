/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L11.Adapter;

/**
 *
 * @author ali.nizam
 */
public class MP3 implements IOldPlayer{

    @Override
    public void play() {
        System.out.println("MP3");
    }
    
}
