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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculate newCalculate = new Calculate();
        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    System.out.print("Enter number: ");
                    double number1 = Validation.checkInputDouble();
                    System.out.print("Enter operator : ");
                    String operator = Validation.checkInputOperator();
                    System.out.print("Enter number: ");
                    double number2 = Validation.checkInputDouble();
                    System.out.println("Result : "+newCalculate.calculate(number1, operator, number2));                    
                    break;
                case 2 :
                    double bmiValue = newCalculate.caculateBMI();
                    break;
                case 3:
                    return;
            }
        }
    }
    
}
