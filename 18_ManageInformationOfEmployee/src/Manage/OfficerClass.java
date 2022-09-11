/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manage;

/**
 *
 * @author admin
 */
public class OfficerClass extends Employee{
    private double coefficientsSalary;
    public OfficerClass() {
    }

    public OfficerClass(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    public OfficerClass(double coefficientsSalary, String id, String name, double salary) {
        super(id, name, salary);
        this.coefficientsSalary = coefficientsSalary;
    }

    public double getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }
    public void input(){
        super.input();
        System.out.print("Enter coefficients salary : ");
        coefficientsSalary = Validation.checkInputInt();
    }
    @Override
    double calsalary() {
        return coefficientsSalary*1650000;
    }
    
}
