/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContactManagerProgram;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Validation {
    public static Scanner sc = new Scanner(System.in);
    private static final String valid_phone = "^(\\d{10}$)|^(\\d{3}+\\-+\\d{3}+\\-+\\d{4}$)|^(\\d{3}+\\-+\\d{3}+\\-+\\d{4}+\\s+x+\\d{4}$)|^(\\d{3}+\\-+\\d{3}+\\-+\\d{4}+\\s+ext+\\d{4}$)|^(\\d{3}+\\.+\\d{3}+\\.+\\d{4}$)|^(\\d{3}+\\s+\\d{3}+\\s+\\d{4}$)";

    public static String checkInputString() {
        while (true) {
            String result = sc.next().trim();

            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.println("Enter again : ");
            } else {
                return result;
            }
        }
    }

    public static String isValidPhoneNumber() {
        while (true) {
            String result = checkInputString();
            if (result.matches(valid_phone)) {
                return result;
            }

            System.out.println("Invalid Number");
            System.out.println("Input phone number must be 1234567890 "
                    + "• 123-456-7890 "
                    + "• 123-456-7890 x1234 "
                    + "• 123-456-7890 ext1234 "
                    + "• 123.456.7890 "
                    + "• 123 456 7890 ");
            System.out.print("Enter again :");
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

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean checkInputYN() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
        }
    }
}
