/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChangebasenumbersystemProgram;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        Convert newConvert = new Convert();
        while (true) {
            Menu.menu();
            System.out.print("Enter your choice : ");
            int userchoice = Validation.checkInputIntLimit(1, 4);
            switch (userchoice) {
                case 1:
                    String binaryNumber = Validation.checkBinaryNumber();
                    newConvert.convertFromBinary(binaryNumber);
                    break;
                case 2 :
                    System.out.print("Enter decimal number : ");
                    String decimalNumber = Integer.toString(Validation.checkInputInt());
                    newConvert.convertFromDecimal(decimalNumber);
                    break;
                case 3:
                    String hexadecimalNumber = Validation.checkHexaDecimalNumber();
                    newConvert.convertFromHexaDecimal(hexadecimalNumber);
                    break;  
                case 4 :
                    return;
            }
        }
    }
}
