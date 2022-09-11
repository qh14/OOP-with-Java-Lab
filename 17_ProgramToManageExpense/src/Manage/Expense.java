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
public class Expense {
    private int ID;
    private String date;
    private double amountOfMoney;
    private String content;

    public Expense() {
    }

    public Expense(int ID, String date, double amountOfMoney, String content) {
        this.ID = ID;
        this.date = date;
        this.amountOfMoney = amountOfMoney;
        this.content = content;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Expense{" + "ID=" + ID + ", date=" + date + ", amountOfMoney=" + amountOfMoney + ", content=" + content + '}';
    }
    
}
