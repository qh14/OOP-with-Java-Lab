/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HandlingFractionsProgram;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Fraction> list = new ArrayList<>();
        FractionManage newFractionManage = new FractionManage();
        System.out.println("Enter the number of element : ");
        int n = Validation.checkInputInt();
        int numerator;
        int denominator;
        int max = 10;
        int min = 1;
        for (int i = 0; i < n; i++) {
            numerator = (int) (Math.random() * (max - min + 1) + min);
            denominator= (int) (Math.random() * (max - min + 1) + min);
            Fraction newFraction = new Fraction(numerator, denominator);
            list.add(newFraction);
        }
        
        Collections.sort(list);
        System.out.println("Sorted fraction list : ");
        System.out.print("[ ");
        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i));
            if (i < n-1) {
                System.out.print(", ");
            }
            
        }
        System.out.print(" ]\n");
        Fraction sumfraction = new Fraction(0, 1);     
        for (int i = 0; i < n; i++) {
            sumfraction = newFractionManage.sumCalculate(sumfraction, list.get(i));
            
        }
        System.out.println("Sum of fractions : ");
        System.out.println(sumfraction.getNumerator()+"/"+sumfraction.getDenominator());
    }
}
