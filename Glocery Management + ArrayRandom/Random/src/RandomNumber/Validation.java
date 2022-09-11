/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomNumber;

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
     public static int checkInputPositiveNumber(){
        while (true) {
            int price = checkInputInt();
            if (price > 0) {
                return price;
            }
            System.out.println("Please input a positive integer");
            System.out.print("Enter number: ");
        }
    }
}
