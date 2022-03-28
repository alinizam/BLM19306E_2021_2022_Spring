/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L7.SingleResponsibility.Good;

/**
 *
 * @author ali.nizam
 */
public class EmailValidatorImp implements IEmailValidator{
    public boolean validateEmail(String email) {
        String re = "VAlidator + regualar expression";
        return re.equals(email);
    }
}
