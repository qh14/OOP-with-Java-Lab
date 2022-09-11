/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomNumber;

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
        randomNumber();
    }

    public static void randomNumber() {
        boolean valid = true;
        int n = 0;
        int max = 0;
        while (valid) {
            System.out.print("Enter number of element: ");
             n= Validation.checkInputPositiveNumber();
            System.out.print("Enter max value: ");
            max = Validation.checkInputInt();
            if (n < max) {
                valid = false;
            }else{
                System.out.println("The number of elements in the array must be less than the maximum value when randomly choosing any number.");
            }
        }
        int[] arrayRandom = new int[n];
        for (int i = 0; i < n; i++) {
            int number = (int) (Math.random() * (max) + 1);
            while (checkCoincide(number, arrayRandom)) {
                number = (int) (Math.random() * (max) + 1);
            }
            arrayRandom[i] = number;
        }
        System.out.print("Array Random: ");
        for (int i = 0; i < arrayRandom.length; i++) {
            System.out.print(arrayRandom[i] + " ");

        }
    }

    public static boolean checkCoincide(int a, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                return true;
            }

        }
        return false;
    }

}
