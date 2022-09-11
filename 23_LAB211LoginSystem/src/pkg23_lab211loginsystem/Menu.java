/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg23_lab211loginsystem;

/**
 *
 * @author admin
 */
public class Menu {

    public static int menu() {
        System.out.print("-------Login Program-------\n"
                + "1. Vietnamese\n"
                + "2. English\n"
                + "3. Exit\n"
                + "Please choice one option:");
        int choice = Vaildation.checkInputIntLimit(1, 3);
        return choice;
    }
}
