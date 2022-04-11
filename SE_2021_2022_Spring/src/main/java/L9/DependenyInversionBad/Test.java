/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L9.DependenyInversionBad;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        System.out.println(c.calculate(5, 3, Operations.ADD));
        System.out.println(c.calculate(5, 3, Operations.SUBSTACT));
    }
}
