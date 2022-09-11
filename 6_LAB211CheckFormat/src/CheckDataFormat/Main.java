/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CheckDataFormat;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        DataFormat dataFormat = new DataFormat();
        while (!dataFormat.isValidPhoneNumber()) {
            
        }
        while (!dataFormat.isValidEmail()) {
            System.out.println("Invalid Email");
        }
        while (!dataFormat.isValidDate()) {
            System.out.println("Date is invalid. Input date must follow the dd/MM/yyyy format.");
        }
    }
}
