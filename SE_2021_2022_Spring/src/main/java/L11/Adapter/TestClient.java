/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L11.Adapter;

/**
 *
 * @author ali.nizam
 */
public class TestClient {
    public static void main(String[] args) {
        IOldPlayer mp3=new MP3();
        mp3.play();
        INewPlayer mp4=new MP4();
        mp4.playFile();
    }
    /*void control(INewPlayer p){
        p.playFile();
    }*/
}
