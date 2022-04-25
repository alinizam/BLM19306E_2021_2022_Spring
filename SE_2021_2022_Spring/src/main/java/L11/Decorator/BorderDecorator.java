/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L11.Decorator;

/**
 *
 * @author ali.nizam
 */
public class BorderDecorator extends ShapeDecorator{
    public BorderDecorator(Shape shape) {
        super(shape);
    }
    public void decorate(){
        super.decorate();
        System.out.println("border added");
    }
}
