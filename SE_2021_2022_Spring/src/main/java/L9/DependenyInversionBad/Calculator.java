/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L9.DependenyInversionBad;

/**
 *
 * @author ali.nizam
 */
public class Calculator {

    int calculate(int a, int b, Operations operation) {
        int result = 0;
        if (operation == Operations.ADD) {
            AddOperation opt = new AddOperation();
            result = opt.add(a, b);
        } else if (operation == Operations.SUBSTACT) {
            SubstractOperation opt = new SubstractOperation();
            result = opt.substract(a, b);
        }
        return result;
    }

}
