/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L9.DependecyInversionGood;

/**
 *
 * @author ali.nizam
 */
public class MultiplyOperation implements IOperation{

    @Override
    public int operate(int a, int b) {
        return a*b;
    }
    
}
