/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L13.Interprater;

/**
 *
 * @author ali.nizam
 */
public class ClientTest {
    public static void main(String[] args) {
        String context="1a";
        Expression expreression=new ConcatNonTerminalExpression(
                                    new DecideTypeTerminalExpression(context), 
                                    new DecideTypeTerminalExpression(context));
        expreression.interprate(context);
    }
}
