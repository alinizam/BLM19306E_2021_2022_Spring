/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L11.Bridge;

/**
 *
 * @author ali.nizam
 */
public abstract class Shape {
    IPrintColor printColor;

    public Shape(IPrintColor printColor) {
        this.printColor = printColor;
    }
    
    void colorObject(){
        System.out.println(this);
        printColor.colorShape();
    }
}
