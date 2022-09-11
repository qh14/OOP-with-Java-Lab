/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manage;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class ManageExpense {

    ArrayList<Expense> listExpenses = new ArrayList<>();
    public static int count = 1;

    public void addExpenses() {
        System.out.println("-------- Add an expense--------");
        System.out.print("Enter Date: ");
        String date = Validation.checkDateFormat();
        System.out.print("Enter Amount : ");
        double amount = Validation.checkInputDouble();
        System.out.print("Enter Content: ");
        String content = Validation.checkInputString();
        Expense newExpense = new Expense(count, date, amount, content);
        listExpenses.add(newExpense);
        count++;
    }

    public void displayAll() {
        if (listExpenses.isEmpty()) {
            System.out.println("List Empty.");
            return;
        }
        double total = 0;
        System.out.println("---------Display all expenses------------");
        System.out.printf("%-5s%-20s%-20s%-25s\n", "ID", "Date", "Amount", " Content");
        for (Expense listExpense : listExpenses) {
            System.out.printf("%-5d%-20s%-20.1f%-25s\n", listExpense.getID(), listExpense.getDate(), listExpense.getAmountOfMoney(), listExpense.getContent());
            total += listExpense.getAmountOfMoney();
        }
        System.out.printf("%25s%1.1f\n", "Total : ", total);
    }

    public void deleteExpenses() {
        System.out.println("--------Delete an expense------");
        System.out.print("Enter ID:");
        int id = Validation.checkInputInt();
        if (Validation.checkIDExist(listExpenses, id)) {
            System.out.println("Delete an expense fail ");
            return;
        }
        listExpenses.remove(findID(id) - 1);
        System.out.println("Delete an expense successful");
    }

    public int findID(int id) {
        for (int i = 0; i < listExpenses.size(); i++) {
            if (listExpenses.get(i).getID() == id) {
                return id;
            }

        }
        return -1;
    }
}
