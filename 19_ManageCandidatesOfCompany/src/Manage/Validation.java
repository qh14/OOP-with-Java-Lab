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
                System.out.println("Please enter number : ");
            }
        }
    }

    public static int checkInputSize() {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Value of size is digit");
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

    public static String checkDateFormat() {
        while (true) {

            try {
                String inputString = checkInputString();
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

    public static String checkSimpleDateFormat() {
        while (true) {

            try {
                String inputString = checkInputString();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
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

    public static String checkInputPhone() {
        while (true) {
            String result = checkInputString();
            if (result.matches("^\\d{10}\\d*$")) {
                return result;
            } else {
                System.err.println("Phone is number with minimum 10 characters");
                System.out.print("Enter again: ");
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

    public static boolean checkYN() {
        while (true) {
            String res = checkInputString();
            if (res.equalsIgnoreCase("Y")) {
                return true;
            }
            if (res.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.println("Enter again");
        }
    }

    public static String checkInputGraduationRank() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Excellence")
                    || result.equalsIgnoreCase("Good")
                    || result.equalsIgnoreCase("Fair")
                    || result.equalsIgnoreCase("Poor")) {
                return result;
            } else {
                System.err.println("Please input string: Excellence, Good, Fair, Poor");
                System.out.print("Enter again: ");
            }
        }
    }

    public static String checkInputEmail() {

        while (true) {
            String result = checkInputString();
            if (result.matches("^(.+)@(.+)$")) {
                return result;
            } else {
                System.err.println("Email with format <account name>@<domain>");
                System.out.print("Enter again: ");
            }
        }
    }

    public static boolean checkExistExperienceExist(ArrayList<Candidate> list) {
        for (Candidate candidate : list) {
            if (candidate instanceof ExperienceCandidate) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkExistFresherExist(ArrayList<Candidate> list) {
        for (Candidate candidate : list) {
            if (candidate instanceof FresherCandidate) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkExistInternExist(ArrayList<Candidate> list) {
        for (Candidate candidate : list) {
            if (candidate instanceof InternCandidate) {
                return true;
            }
        }
        return false;
    }

}
