/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB211_ManageGrocery;

import java.util.ArrayList;
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

    public static boolean checkExist(ArrayList<Item> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode().equals(id)) {
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
    public static String checkInputCode(ArrayList<Item> list){
        while (true) {
            String code = checkInputString();
            if (!checkExist(list, code)) {
                return code;
            }
            System.out.println("Item code is unique");
            System.out.print("Enter Code: ");
        }
        
    }
    public static int checkInputPrice(){
        while (true) {
            int price = checkInputInt();
            if (price > 0) {
                return price;
            }
            System.out.println("Price is a positive integer");
            System.out.print("Enter Price: ");
        }
    }
}
