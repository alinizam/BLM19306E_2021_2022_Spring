/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L15.Strategy;

/**
 *
 * @author ali.nizam
 */
public class Context {
    Strategy operation;
    int x,y;
 
    void writeArea(Strategy s){
        System.out.println(s.doOperation(x, y));        
    }
    
    
}
