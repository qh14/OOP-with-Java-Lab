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
public class Calculator {

    public int[][] inputMatrix(int k) {
        System.out.print("Enter Row Matrix " + k + " : ");
        int rowNum = Validation.checkInputInt();
        System.out.print("Enter Column Matrix : ");
        int columnNum = Validation.checkInputInt();
        int[][] matrix = new int[rowNum][columnNum];
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < columnNum; j++) {
                System.out.print("Enter matrix " + k + "[" + i + ", " + j + " ]" + " : ");
                matrix[i][j] = Validation.checkInputInt();                
            }
            
        }
        return matrix;
    }

    public int[][] additionMatrix(int[][] matrix1, int[][] matrix2) {
        
        int[][] matrixSum = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrixSum.length; i++) {
            for (int j = 0; j < matrixSum[0].length; j++) {
                matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];                
            }
            
        }
        return matrixSum;
    }

    public int[][] subMatrix(int[][] matrix1, int[][] matrix2) {
        
        int[][] matrixSum = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrixSum.length; i++) {
            for (int j = 0; j < matrixSum[0].length; j++) {
                matrixSum[i][j] = matrix1[i][j] - matrix2[i][j];                
            }
            
        }
        return matrixSum;
    }

    public int[][] multiplicationMatrix(int[][] matrix1, int[][] matrix2) {
        
        int[][] matrixMul = new int[matrix1.length][matrix2[0].length];
        
        for (int i = 0; i < matrix1.length; i++) {
            
            for (int j = 0; j < matrix2[0].length; j++) {      
                int sumCal = 0;
                for (int k = 0; k < matrix1[0].length; k++) {
                    sumCal += matrix1[i][k] *matrix2[k][j];                    
                }
                matrixMul[i][j] = sumCal;
            }
            
        }
        return matrixMul;
    }
    public void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {                
                System.out.print("[" + matrix[i][j] + "] ");                
            }
            System.out.println("");
        }
    }
    public void displayResult(int[][] matrix,int[][] matrix1,int[][] matrix2,String s){
        System.out.println("----------------- Result ----------------");
        displayMatrix(matrix1);
        System.out.println(s);
        displayMatrix(matrix2);
        System.out.println("=");
        displayMatrix(matrix);
    }
}
