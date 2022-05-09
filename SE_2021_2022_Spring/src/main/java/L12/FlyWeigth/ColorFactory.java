/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L12.FlyWeigth;

import java.util.HashMap;

/**
 *
 * @author ali.nizam
 */
public class ColorFactory {
    static HashMap<String, Object> colors=new HashMap<>();
    static Color getColor(String colorName){
        Color c=(Color)colors.get(colorName);
        if (c==null){
            c=new Color(colorName);
            colors.put(colorName,c); 
        }
        return c;
    }
    
}
