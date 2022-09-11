/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9_lab211manageworkerinformation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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
                int result = Integer.parseInt(sc.nextLine());
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
                double result = Double.parseDouble(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Invalid ");
                System.out.print("Enter again : ");
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

    public static boolean checkWorkerExist(ArrayList<Worker> lw, String id) {

        for (Worker worker : lw) {
            if (id.equalsIgnoreCase(worker.getId())) {
                return false;
            }
        }
        return true;

    }

    public static double checkInputSalaryValid(double a) {
        while (true) {
            int num = Validation.checkInputInt();
            if (num <= a) {
                return num;
            } else {
                System.out.print("Must be smaller than current salary " + a + "\n");
                System.out.print("Enter Salary : ");

            }
        }
    }

    public static String checkIDValid(ArrayList<Worker> lw) {
        while (true) {
            String id = checkInputString();
            if (checkWorkerExist(lw, id)) {
                return id;
            } else {
                System.out.print("Dupplicated!\n");
                System.out.print("Enter Code: ");

            }
        }
    }

    public static String getCurrentDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        return dateFormat.format(calendar.getTime());
    }

}
