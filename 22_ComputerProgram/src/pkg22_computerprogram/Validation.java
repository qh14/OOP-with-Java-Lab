/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg22_computerprogram;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Validation {

    public static Scanner sc = new Scanner(System.in);

    public static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please enter number : ");
            }
        }
    }

    // 
    public static String checkInputOperator() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("+")
                    || result.equalsIgnoreCase("-")
                    || result.equalsIgnoreCase("x")
                    || result.equalsIgnoreCase("/")
                    || result.equalsIgnoreCase("^")
                    || result.equalsIgnoreCase("=")) {
                return result;
            } else {
                System.err.println("Please input operator :  +, -, x, /, ^, = ");
                System.out.print("Enter again: ");
            }
        }
    }

    public static String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.println("Enter again : ");
            } else {
                return result;
            }
        }
    }

    public static double checkInputDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(sc.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number double : ");
                System.out.print("Enter again : ");
            }
        }
    }

    public static String checkStatus(double bmiValue) {
        String status = "";
        if (bmiValue < 19) {
            status = "Under-standard";
        } else if (bmiValue >= 19 && bmiValue <= 25) {
            status = "Standard";
        } else if (bmiValue > 25 && bmiValue <= 30) {
            status = "Overweight";
        } else if (bmiValue > 40) {
            status = "Very fat - should lose weight immediately";
        } else {
            status = "Fat - should lose weight";
        }
        return status;
    }

    public static double checkInputValue(String st) {
        while (true) {
            double result = checkInputDouble();
            if (result > 0) {
                return result;
            } else {
                System.err.println(st+"must be greater than 0");
                System.out.print("Enter again: ");
            }
        }
    }
}
