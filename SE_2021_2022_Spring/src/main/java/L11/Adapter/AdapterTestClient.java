/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L11.Adapter;

/**
 *
 * @author ali.nizam
 */
public class AdapterTestClient {
    public static void main(String[] args) {
        INewPlayer adapter=new Adaptor(new MP3());
        adapter.playFile();
        adapter=new MP4();
        adapter.playFile();
    }
}
