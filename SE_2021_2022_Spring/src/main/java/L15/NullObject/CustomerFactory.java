/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L15.NullObject;

/**
 *
 * @author ali.nizam
 */
public class CustomerFactory {

    Customer getCustomer(int money) {
        Customer c = null;
        if (money > 10000) {
            c = new AccountableCustomer(money);
        } else if (money > 0) {
            c = new NormalCustomer(money);
        } else {
            c = new NullCustomer(money);
        }

        return c;
    }
}
