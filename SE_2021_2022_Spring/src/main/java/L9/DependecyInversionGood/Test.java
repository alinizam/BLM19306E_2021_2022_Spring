/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L9.DependecyInversionGood;

import com.sun.xml.internal.ws.assembler.jaxws.MustUnderstandTubeFactory;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        System.out.println(c.operate( 5, 3, new AddOperation()));
        System.out.println(c.operate( 5, 3, new SubstractOperation()));
        System.out.println(c.operate( 5, 3, new MultiplyOperation()));
    }
}
