/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagePersonInfo;

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
                System.err.println("Please input number integer : ");
                System.out.println("Enter again : ");
            }
        }
    }
     public static double checkInputSalary() {
        while (true) {
            try {
                double result = Double.parseDouble(sc.nextLine().trim());
                if (result < 0) {
                    System.out.println("Salary is greater than zero");
                    System.out.print("Please input salary:  ");
                }else{
                    return result;
                }
            } catch (NumberFormatException e) {
                System.err.println("You must input digit");
                System.out.print("Please input salary:  ");
            }
        }
    }
      public static int checkinputlimit(int min,int max){
            while (true) {
                try {
                    int result = Integer.parseInt(sc.nextLine().trim());
                    if (result<min||result>max) {
                        throw new NumberFormatException();
                    }
                    return result;
                } catch (NumberFormatException e) {
                    System.out.println("Please input number in rage[ "+min+","+max+"]");
                }
            }
        }
        public static String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.out.println("Enter again : ");
            } else {
                return result;
            }
        }
    }
     
}
