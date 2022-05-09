/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L12.Facade;

/**
 *
 * @author ali.nizam
 */
public class Facade2_3 {
     void callSubsystem(){
        SubSystem2 s2=new SubSystem2();
        s2.function2();
        SubSystem3 s3=new SubSystem3();
        s3.function3();
    }
}
