/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9_lab211manageworkerinformation;

import java.util.Date;

/**
 *
 * @author admin
 */
public class SalaryHistory {
    private String dateChange;
    private String status;
    private double newSalary;

    public SalaryHistory() {
    }

    public SalaryHistory(String dateChange, String status, double newSalary) {
        this.dateChange = dateChange;
        this.status = status;
        this.newSalary = newSalary;
    }

    public String getDateChange() {
        return dateChange;
    }

    public void setDateChange(String dateChange) {
        this.dateChange = dateChange;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getNewSalary() {
        return newSalary;
    }

    public void setNewSalary(double newSalary) {
        this.newSalary = newSalary;
    }

    @Override
    public String toString() {
        return "SalaryHistory{" + "dateChange=" + dateChange + ", status=" + status + ", newSalary=" + newSalary + '}';
    }
    
   
    public void addSalaryHistory(SalaryHistory salaryHistory){
        salaryHistory.addSalaryHistory(salaryHistory);
    }
    
}
