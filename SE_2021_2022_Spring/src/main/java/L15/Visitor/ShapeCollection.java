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
public class ShapeCollection {
    ArrayList<Shape> shapes=new ArrayList();
    ShapeVisitor visitor;

    public ShapeCollection(ShapeVisitor visitor) {
        this.visitor = visitor;
    }
    
}
