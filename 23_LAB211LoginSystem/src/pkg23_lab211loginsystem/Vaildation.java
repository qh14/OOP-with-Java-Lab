/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg23_lab211loginsystem;

import java.util.Locale;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Vaildation {
    
    public static Locale localeEn = new Locale("en");
    public static ResourceBundle labels;
    public static Locale localeVi = new Locale("vi");
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
    
    public static void checkLanguage(int choice) {
        switch (choice) {
            case 1:
                labels = ResourceBundle.getBundle("pkg23_lab211loginsystem.MessageBundle_vi_VI", localeVi);
                break;
            case 2:
                labels = ResourceBundle.getBundle("pkg23_lab211loginsystem.MessageBundle_en_EN", localeEn);
                break;
        }
        
    }
    
    public static int checkInputIntLimit(int a, int b) {
        while (true) {
            int num = checkInputInt();
            if (num >= a && num <= b) {
                return num;
            } else {
                System.out.print("Please only " + a + " to " + b + ":");
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
    
    public static String checkInputAccountNumber(int choice) {
        while (true) {
            String result = checkInputString();
            if (result.matches("^\\d{9}\\d$")) {
                return result;
            } else {
                checkLanguage(choice);
                System.out.println(labels.getString("errorAccNum"));
                System.out.println(labels.getString("accNum"));
                
            }
        }
    }
    
    public static String checkPassWord(int choice) {
        while (true) {
            String result = checkInputString();
            if (result.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,31}$")) {
                return result;
            } else {
                checkLanguage(choice);
                System.out.println(labels.getString("errorPass"));
                System.out.print(labels.getString("pass"));
                
            }
        }
    }
    
    public static String generateCap() {
        while (true) {
            char[] data = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
            String captcha = "";
            Random r = new Random();
            for (int i = 0; i < 6; i++) {
                int n = r.nextInt(data.length);
                captcha += data[n];
            }
            if (captcha.matches("^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{6}$")) {
                return captcha;
            }
            
        }
    }
    
    public static boolean checkcap(String string, String entercap, int choice) {
        if (string.equals(entercap)) {
            return true;
        } else {
            checkLanguage(choice);
            System.out.println(labels.getString("errorCap"));
            
            return false;
        }
    }
    
}
