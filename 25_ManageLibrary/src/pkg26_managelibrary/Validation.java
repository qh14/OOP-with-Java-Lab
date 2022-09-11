/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg26_managelibrary;

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
     public static boolean checkExist(ArrayList<Document> list,String id){
         for (int i = 0; i < list.size(); i++) {
             if (list.get(i).getDocumentID().equals(id)) {
                 return true;
             }
             
         }
         return false;
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
     public static String inputID(ArrayList<Document> list){
         while (true) {
             String newid = Validation.checkInputString();
             if (!checkExist(list, newid)) {
                 return newid;
             }
             System.out.println("ID duplicated with existed.");
             System.out.print("Enter Document ID: ");            
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
                    System.out.println("Issue date must format must be dd/mm/yyyy");
                    System.err.println("Date: ");
                }
            } catch (Exception e) {
                System.out.println("Issue date must format must be dd/mm/yyyy");
                System.out.print("Date: ");
            }
        }
    }
     public static String checkMonthFormat() {
        while (true) {

            try {
                String inputString = checkInputString();
                SimpleDateFormat formatter = new SimpleDateFormat("MM-yyyy");
                Date date = formatter.parse(inputString);
                if (inputString.equalsIgnoreCase(formatter.format(date))) {
                    return inputString;
                } else {
                    System.out.println("Issue month format must be mm/yyyy");
                    System.err.println("Issue Month: ");
                }
            } catch (Exception e) {
                System.out.println("Issue month format must be mm/yyyy");
                System.out.print("Issue Month: ");
            }
        }
    }
}
