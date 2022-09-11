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
public class Calculate {

    private double memory = 0;

    public double calculate(double a, String operator, double b) {
        double firstNumber = a;
        double secondNumber = b;
        String newOperator = operator;
        while (true) {
            switch (newOperator) {
                case "x":
                    memory = firstNumber * secondNumber;
                    break;
                case "/":
                    if (secondNumber != 0 ) {                       
                        memory = firstNumber/secondNumber;
                    } else {
                        System.out.println("The denominator must be other than 0");
                    }
                    break;
                case "+" : 
                    memory = firstNumber + secondNumber;
                    break;
                case "^" : 
                    memory = Math.pow(firstNumber, secondNumber);
                    break;
                case "-" : 
                    memory = firstNumber - secondNumber;
                    break;
            }
            System.out.println("Memory : "+memory);
            System.out.print("Enter Operator : ");
            newOperator = Validation.checkInputOperator();
            
            if (newOperator.equalsIgnoreCase("=")) {
                double result = memory;
                memory = 0;
                return result;
            }
            System.out.print("Enter number: ");
            double number = Validation.checkInputDouble();
            firstNumber = memory;
            secondNumber = number;
        }

    }
    public double caculateBMI(){
        System.out.println("----- BMI Calculator -----");
        System.out.print("Enter Weight(kg): ");
        double weight = Validation.checkInputValue("Weight");
        System.out.print("Enter Height(cm): ");
        double height = Validation.checkInputValue("Height");
        height = height/100;
        double bmiValue = weight / Math.pow(height, 2);
        System.out.println("BMI Number: "+bmiValue);
        System.out.println("BMI Status : "+Validation.checkStatus(bmiValue));
        return bmiValue;
    }
}
