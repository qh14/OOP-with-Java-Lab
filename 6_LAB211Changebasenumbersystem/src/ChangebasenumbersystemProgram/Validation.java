/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChangebasenumbersystemProgram;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Validation {

    public static Scanner sc = new Scanner(System.in);

    public static String checkInputString() {
        while (true) {
            String result = sc.next().trim();

            sc.nextLine();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.println("Enter again : ");
            } else {
                return result;
            }
        }
    }

    public static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(sc.next());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number integer : ");
                System.out.println("Enter again : ");
            }
        }
    }

    public static int checkInputIntLimit(int a, int b) {
        while (true) {
            int num = Validation.checkInputInt();
            if (num >= a && num <= b) {
                return num;
            } else {
                System.out.print("Please only " + a + " to " + b + ":");
            }
        }
    }

    public static String checkBinaryNumber() {
        
        boolean valid = false;
        String binaryNumber = null;
        while (!valid) {
            System.out.print("Enter Binary number : ");
            binaryNumber = checkInputString();
            valid = binaryNumber.matches("^[01]+$");
            if (!valid) {
                System.err.println("Using two unique digits (0 and 1)");
            }
        }
        return binaryNumber;
    }
    public static String checkHexaDecimalNumber(){
        boolean valid = false;
        String hexadecimalNumber = null;
        while (!valid) {
            System.out.print("Enter hexadecimal number : ");
            hexadecimalNumber = checkInputString();
            valid = hexadecimalNumber.matches("^[0-9A-F]+$");
            if (!valid) {
                System.err.println("Number containing characters 0 to 9 or A to F");
            }
        }
        return hexadecimalNumber;
    }
}
