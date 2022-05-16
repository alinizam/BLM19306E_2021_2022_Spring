/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L13.Interprater;

/**
 *
 * @author ali.nizam
 */
public class DecideTypeTerminalExpression implements Expression{
    String  data;

    public DecideTypeTerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public void interprate(String context) {
        if (Character.isDigit(context.charAt(0))){
            System.out.println(context.charAt(0)+"-"+"digit");
        }else{
            System.out.println(context.charAt(0)+"-"+"non digit");
        }
            
    }

   
}
