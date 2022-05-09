/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L12.FlyWeigth;

/**
 *
 * @author ali.nizam
 */
public class Shape {
    Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(String s) {
        this.color = ColorFactory.getColor(s);
    } 
}
