/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg24_calculatorprogram;

/**
 *
 * @author admin
 */
public class Menu {
    public static int menu(){
        System.out.println("==============Calculate program =============");
        System.out.println("1. Addition Matrix");
        System.out.println("2. Subtraction Matrix");
        System.out.println("3. Multiplication Matrix");
        System.out.println("4. Quit");
        System.out.print("Your choice : ");
        int choice = Validation.checkInputInt();
        return choice;
    }
}
