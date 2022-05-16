/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L13.Interprater;

/**
 *
 * @author ali.nizam
 */
public class ConcatNonTerminalExpression implements Expression{
    Expression e1,e2;

    public ConcatNonTerminalExpression(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    @Override
    public void interprate(String context) {
        e1.interprate(context.substring(0,1));
        e2.interprate(context.substring(1,2));
    }
    
    
    
}
