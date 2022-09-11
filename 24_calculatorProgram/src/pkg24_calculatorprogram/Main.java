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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculator newCalculator = new Calculator();
        // TODO code application logic here
        while (true) {
            boolean checkinput = false;
            int choice = Menu.menu();
            if (choice == 4) {
                return;
            }
            int[][] matrix1 = null;
            int[][] matrix2 = null;
            while(!checkinput){
            matrix1 = newCalculator.inputMatrix(1);
            matrix2 = newCalculator.inputMatrix(2);
            checkinput = Validation.checkDK(matrix1, matrix2, choice);
            }
            switch (choice) {
                case 1:
                    newCalculator.displayResult(newCalculator.additionMatrix(matrix1, matrix2), matrix1, matrix2, "+");
                    break;
                case 2:

                    newCalculator.displayResult(newCalculator.subMatrix(matrix1, matrix2), matrix1, matrix2, "-");
                    break;
                case 3:
                    newCalculator.displayResult(newCalculator.multiplicationMatrix(matrix1, matrix2), matrix1, matrix2, "x");
                    break;
            }
        }
    }

}
