/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L13.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ali.nizam
 */
public class ClientTest {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList();
        names.add("Ahmet");
        names.add("Mehmet");
        for (String name : names) {
            System.out.println(name);
        }
        
        Iterator i=names.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
