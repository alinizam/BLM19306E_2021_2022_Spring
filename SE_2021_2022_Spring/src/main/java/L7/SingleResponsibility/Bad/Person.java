/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L7.SingleResponsibility.Bad;

/**
 *
 * @author ali.nizam
 */
class Person {
    public String name;
    String email;
    Person(String name, String email){
      
        this.name = name;
        if(this.validateEmail(email)) {
          this.email = email;
        }
        else {
            throw new Error("Invalid email!");
        }
    }
    boolean validateEmail(String email) {
        String re = "VAlidator + regualar expression";
        return re.equals(email);
    }
}

