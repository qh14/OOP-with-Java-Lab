/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manage;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
     public static String checkDateFormat() {
        while (true) {

            try {
                String inputString = checkInputString();
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
                Date date = formatter.parse(inputString);
                if (inputString.equalsIgnoreCase(formatter.format(date))) {
                    return inputString;
                } else {
                    System.err.println("Date: ");
                }
            } catch (Exception e) {
                System.out.print("Date: ");
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
                System.out.println("Enter again : ");
            }
        }
    }
      public static boolean checkIDExist(ArrayList<Expense> list, int id ) {
        for (Expense l : list) {
             if (id == l.getID()) {
                return false;
            }
        }
        return true;
    }
}
