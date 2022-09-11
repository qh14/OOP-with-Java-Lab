/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HandlingFractionsProgram;

/**
 *
 * @author admin
 */
public class Fraction implements Comparable<Fraction>{
    int numerator;
    int denominator;

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return  numerator + "/" + denominator ;
    }
    

    @Override
    public int compareTo(Fraction o) {
        return this.numerator*o.denominator - o.numerator*this.denominator;  //To change body of generated methods, choose Tools | Templates.
    }
    
}
