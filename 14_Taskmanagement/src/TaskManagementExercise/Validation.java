/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TaskManagementExercise;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Validation {

    public static Scanner sc = new Scanner(System.in);

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

    public static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number integer : ");
                System.out.println("Enter again : ");
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

    public static double checkInputDoubleLimit(double a, double b) {
        while (true) {
            double num = Validation.checkInputDouble();
            if (num >= a && num <= b) {
                return num;
            } else {
                System.out.print("Please only " + a + " to " + b + ":");
            }
        }
    }

    public static double checkPlan() {
        while (true) {
            double plan = Validation.checkInputDoubleLimit(8.0, 17.5);
            double planValue = plan * 10;
            if (planValue % 5 == 0) {
                return plan;
            } else {
                System.out.println("Example : 8.0, 8.5, 9.0, 9.5 … -> 17.5.");
                System.out.print("Enter again : ");
            }
        }
    }

    public static boolean checkPlan(double planFrom, double planTo) {
        if (planFrom >= planTo) {
            return false;
        }
        return true;
    }

    public static String checkDateFormat() {
        while (true) {

            try {
                String inputString = Validation.checkInputString();
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
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
}
