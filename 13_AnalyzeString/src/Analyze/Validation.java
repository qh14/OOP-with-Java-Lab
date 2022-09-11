/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analyze;

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
    public static boolean checkSquareNumber(int k){

        double sq = Math.sqrt(k);
        return ((sq - Math.floor(sq)) == 0);
    }
}
