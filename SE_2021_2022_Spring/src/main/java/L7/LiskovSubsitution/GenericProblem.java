/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L7.LiskovSubsitution;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ali.nizam
 */
public class GenericProblem {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<Integer>();

        integers.add(2016);
        integers.add(2017);
     // create a compile error
     // List<Number> numbers = integers;
     // numbers.add(3.12);

        System.out.println(integers);   // can print [2016, 2017, 1.68]

    }
}
