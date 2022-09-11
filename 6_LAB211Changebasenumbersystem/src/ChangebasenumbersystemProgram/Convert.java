/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChangebasenumbersystemProgram;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author admin
 */
public class Convert {

    final int A = 10;
    ArrayList<Integer> list = new ArrayList<>();

    public int convertChoice(String from, String destination1, String destination2) {
        System.out.println("1- Convert From " + from + " to " + destination1);
        System.out.println("2- Convert From " + from + " to " + destination2);
        System.out.println("Enter your choice");
        int userchoice = Validation.checkInputIntLimit(1, 2);
        return userchoice;

    }

    public void convertFromBinary(String binary) {
        int choice = convertChoice("binary", "decimal", "hexadecimal");
        switch (choice) {
            case 1:
                System.out.println("Decimal Format : " + convertBinaryToDecimal(binary));
                break;
            case 2:
                System.out.println("Hexadecimal Format : " + convertBinaryToHexaDecimal(binary));
                break;
        }
    }

    public void convertFromDecimal(String decimal) {
        int choice = convertChoice("decimal", "binary", "hexadecimal");
        switch (choice) {
            case 1:
                System.out.println("Binary Format : " + convertDecimalToBinary(decimal));
                break;
            case 2:
                System.out.println("Hexadecimal Format : " + convertDecimalToHexaDecimal(decimal));

                break;
        }
    }

    public void convertFromHexaDecimal(String hexadecimal) {
        int choice = convertChoice("hexadecimal", "binary", "decimal");
        switch (choice) {
            case 1:
                System.out.println("Binary Format : " + convertHexaDecimalToBinary(hexadecimal));
                break;
            case 2:
                System.out.println("Decimal Format : " + convertHexadecimalToDecimal(hexadecimal));
        }
    }

    public String convertBinaryToDecimal(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        return Integer.toString(decimal);
    }

    public String convertBinaryToHexaDecimal(String binary) {
        String decimal = convertBinaryToDecimal(binary);
        String hexadecimal = convertDecimalToHexaDecimal(decimal);
        return hexadecimal;
    }

    public String convertDecimalToBinary(String decimal) {
        int decimalNumber = Integer.parseInt(decimal);
        String binary = Integer.toBinaryString(decimalNumber);
        return binary;
    }

    public String convertDecimalToHexaDecimal(String decimal) {
        char[] hexaDigits = {'1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String hexadecimal = "";
        int decimalNumber = Integer.parseInt(decimal);
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 16;
            hexadecimal = hexaDigits[remainder] + hexadecimal;
            decimalNumber /= 16;
        }
        return hexadecimal;
    }

    public String convertHexadecimalToDecimal(String hexadecimal) {
        int decimal = Integer.parseInt(hexadecimal, 16);
        return Integer.toString(decimal);
    }

    public String convertHexaDecimalToBinary(String hexadecimal) {
        String decimal = convertHexadecimalToDecimal(hexadecimal);
        String binary = Integer.toBinaryString(Integer.parseInt(convertHexadecimalToDecimal(hexadecimal)));
        return binary;
    }

}
