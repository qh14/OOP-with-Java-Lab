/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg24_calculatorprogram;

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
    public static boolean checkDK(int[][] matrix1, int[][] matrix2,int choice){
        boolean check = true;
        switch (choice) {
            case 1:
                if (!(matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length)) {
                    check = false;
                    System.out.println("The size of the two arrays must be equal.");
                }
                break;
            case 2 :
                if (!(matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length)) {
                    check = false;
                    System.out.println("The size of the two arrays must be equal.");
                }
                break;
            case 3 :
                if (!(matrix1[0].length == matrix2.length)) {
                    check = false;
                    System.out.println("The number of columns in the first matrix must be equal to the number of rows in the second matrix");
                }
                break;
            default:
                System.out.println("Error");
        }
        return check;
    }
    
}
