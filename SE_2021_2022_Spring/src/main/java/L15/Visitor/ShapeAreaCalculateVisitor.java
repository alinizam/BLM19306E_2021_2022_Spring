/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L15.Visitor;

/**
 *
 * @author ali.nizam
 */
public class ShapeAreaCalculateVisitor implements ShapeVisitor{

    @Override
    public int operation(Shape shape) {
        int area=0;
        if (shape instanceof Rectangle){
            area=shape.getX()*shape.getY();
        }else if(shape instanceof Triangle){
            area=shape.getX()*shape.getY()/2;
        }
        return area;
    }
    
}
