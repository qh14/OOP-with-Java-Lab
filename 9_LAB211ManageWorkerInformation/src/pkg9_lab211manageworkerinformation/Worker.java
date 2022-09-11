/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9_lab211manageworkerinformation;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Worker implements Comparable<Worker>{

    //id, name, age, salary, work location
    private String id;
    private String name;
    private int age;
    private double salary;
    private String workLocation;

    public Worker() {
    }

    public Worker(String id, String name, int age, double salary, String workLocation) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workLocation = workLocation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    @Override
    public String toString() {
        return "Worker{" + "id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", workLocation=" + workLocation + '}';
    }
    ArrayList<SalaryHistory> salaryHistories = new ArrayList<>();

    public ArrayList<SalaryHistory> getSalaryHistories() {
        return salaryHistories;
    }

    public void setSalaryHistories(ArrayList<SalaryHistory> salaryHistories) {
        this.salaryHistories = salaryHistories;
    }
    public void addSalaryHistory(SalaryHistory salaryHistory){
        salaryHistories.add(salaryHistory);
    }

    @Override
    public int compareTo(Worker o) {
        return this.getId().compareTo(o.getId());
    }
}
