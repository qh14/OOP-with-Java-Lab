/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9_lab211manageworkerinformation;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author admin
 */
public class ManageWorker {

    private ArrayList<Worker> listWorkers = new ArrayList<>();

    public ManageWorker() {
        this.listWorkers = new ArrayList<>();
    }

    public void AddWorker() {
        System.out.println("--------- Add Worker ----------");
        System.out.print("Enter Code: ");
        String code = Validation.checkIDValid(listWorkers);
//        Validation.sc.nextLine();
        System.out.print("Enter Name: ");
        String name = Validation.checkInputString();
        System.out.print("Enter Age: ");
        int age = Validation.checkInputIntLimit(18, 50);
        System.out.print("Enter Salary:");
        double salary = Validation.checkInputDouble();
        System.out.print("Enter work location:");
        String location = Validation.checkInputString();
        Worker newWorker = new Worker(code, name, age, salary, location);
        listWorkers.add(newWorker);
        String date = Validation.getCurrentDate();
        SalaryHistory salaryHistory = new SalaryHistory(date, "-", salary);
        newWorker.addSalaryHistory(salaryHistory);
        System.out.println("Sucessful");
    }

    public void changeSalary(String status) {
        System.out.println("------- Up/Down Salary --------");
        System.out.print("Enter code : ");
        String code = Validation.checkInputString();

        for (Worker listWorker : listWorkers) {
            if (listWorker.getId().equalsIgnoreCase(code)) {
                if (status.equalsIgnoreCase("UP")) {
                    System.out.print("Enter amount: ");
                    double amount = Validation.checkInputDouble();
                    double newSalary = listWorker.getSalary() + amount;
                    listWorker.setSalary(newSalary);
                    String date = Validation.getCurrentDate();
                    SalaryHistory salaryHistory = new SalaryHistory(date, status, newSalary);
                    listWorker.addSalaryHistory(salaryHistory);
                    System.out.println("Sucessful");
                    return;
                } else if (status.equalsIgnoreCase("DOWN")) {
                    System.out.print("Enter amount: ");
                    double amount = Validation.checkInputSalaryValid(listWorker.getSalary());
                    double newSalary = listWorker.getSalary() - amount;
                    listWorker.setSalary(newSalary);
                    String date = Validation.getCurrentDate();
                    SalaryHistory salaryHistory = new SalaryHistory(date, status, newSalary);
                    listWorker.addSalaryHistory(salaryHistory);
                    return;
                }
            }
        }
        System.out.println("Not found worker.");
    }

    public void getInformationSalaryHistory() {
        ArrayList<Worker> workers = new ArrayList<>();
        for (Worker worker : listWorkers) {
            if (worker.getSalaryHistories().size() > 1) {
                workers.add(worker);
            }
        }
        if (workers.size() == 0) {
            System.out.println("Not found");
            return;
        } else {
            Collections.sort(workers);
            System.out.println("--------------------Display Information Salary-----------------------");
            System.out.printf("%15s%15s%15s%15s%15s%15s\n", "Code", "Name", "Age", "Salary", "Status", "Date");
            for (Worker worker : workers) {
                for (SalaryHistory salaryHistory : worker.getSalaryHistories()) {
                    if (salaryHistory.getStatus().equalsIgnoreCase("-") == false) {

                        System.out.printf("%15s%15s%15d%15.1f%15s%15s\n", worker.getId(), worker.getName(), worker.getAge(), salaryHistory.getNewSalary(), salaryHistory.getStatus(), salaryHistory.getDateChange());
                    }
                }
            }
        }
    }
}
