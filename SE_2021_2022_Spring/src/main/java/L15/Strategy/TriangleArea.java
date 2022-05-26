/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L15.Strategy;

/**
 *
 * @author ali.nizam
 */
public class TriangleArea implements Strategy{

    @Override
    public int doOperation(int a, int b) {
        return (a*b)/2;
    }
    
}
