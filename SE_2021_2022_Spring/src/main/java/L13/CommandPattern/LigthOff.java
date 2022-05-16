/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L13.CommandPattern;

/**
 *
 * @author ali.nizam
 */
public class LigthOff implements Command{
    Light ligth;

    public LigthOff(Light ligth) {
        this.ligth = ligth;
    }

    @Override
    public void execute() {
        ligth.lightOff();
    }
}
