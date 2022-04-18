/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L10.Prototype;

import java.util.HashMap;

/**
 *
 * @author ali.nizam
 */
public class ShapeStore {
    private static HashMap<String, Shape> shapeList=new HashMap<>();
    static{
        shapeList.put("black rectangle", new Rectangle("Black"));
        shapeList.put("white rectangle", new Rectangle("White"));
        shapeList.put("triangle", new Triangle("white"));
    }
    static Shape getPrototype(String key){
        return (Shape)shapeList.get(key).clone();
    }
    
    
}
