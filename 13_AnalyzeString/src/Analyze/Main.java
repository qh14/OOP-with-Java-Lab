/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analyze;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        //321sdhkjDFGH!@#$%^22fdsf3
        AnalyzeInputString newAnalyzeInputString = new AnalyzeInputString();
        System.out.println("===== Analysis String program ====");
        System.out.print("Input String : ");
        String inputString = Validation.checkInputString();
        System.out.println("-----Result Analysis------");
        newAnalyzeInputString.printNumber(newAnalyzeInputString.getNumber(inputString));
        newAnalyzeInputString.printCharacter(newAnalyzeInputString.getCharacter(inputString));
        
    }
}
