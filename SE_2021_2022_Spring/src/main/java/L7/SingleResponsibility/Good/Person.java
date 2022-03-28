/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L7.SingleResponsibility.Good;

import L7.SingleResponsibility.Bad.*;

/**
 *
 * @author ali.nizam
 */
class Person {
    public String name;
    String email;
    Person(String name, String email,IEmailValidator e){   
        this.name = name;
        if(e.validateEmail(email)) {
          this.email = email;
        }
        else {
            throw new Error("Invalid email!");
        }
    }
   
}

