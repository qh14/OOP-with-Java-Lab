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
public class FractionManage {
    public int UCLN(int a,int b){
         while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
    public void simplifyFractions(Fraction fraction,int a, int b){
        int ucln = UCLN(a, b);
        fraction.setNumerator(a/ucln);
        fraction.setDenominator(b/ucln);
    }
    public Fraction simplifyFractions(int a, int b){
        int ucln = UCLN(a, b);
        Fraction fraction = new Fraction();
        fraction.setNumerator(a/ucln);
        fraction.setDenominator(b/ucln);
        return fraction;
    }
    public Fraction sumCalculate(Fraction a, Fraction b){
        int newNumerator = a.getNumerator()*b.getDenominator()+a.getDenominator()*b.getNumerator();
        int newDenominator = a.getDenominator()*b.getDenominator();
        
        Fraction newfraction = simplifyFractions(newNumerator, newDenominator);
        return newfraction;
    }
    
}
