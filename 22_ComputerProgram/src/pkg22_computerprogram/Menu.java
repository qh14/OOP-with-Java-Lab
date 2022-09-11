/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg22_computerprogram;

/**
 *
 * @author admin
 */
public class Menu {

    public static int menu() {
        System.out.print("========= Calculator Program =========\n"
                + "1. Normal Calculator\n"
                + "2. BMI Calculator\n"
                + "3. Exit\n"
                + "Please choice one option:");
        int choice = Validation.checkInputInt();
        return choice;
    }
}
