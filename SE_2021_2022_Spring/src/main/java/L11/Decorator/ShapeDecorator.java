/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L11.Decorator;

/**
 *
 * @author ali.nizam
 */
public abstract class ShapeDecorator implements Shape{
    Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }
    public void decorate(){
        System.out.println(shape);
    }
    
}
