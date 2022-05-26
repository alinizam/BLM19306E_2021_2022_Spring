/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L15.Visitor;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class TestClient {
    public static void main(String[] args) {
        ShapeCollection sc=new ShapeCollection(new ShapeAreaCalculateVisitor());
        sc.shapes.add(new Rectangle(5, 10));
        sc.shapes.add(new Rectangle(5, 10));
        sc.shapes.add(new Triangle(2, 2));
        for (Shape shape : sc.shapes) {
            System.out.println(sc.visitor.operation(shape));
        }
    }
}
