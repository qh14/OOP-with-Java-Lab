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
public abstract class Employee {

    protected String id;
    protected String name;
    protected double salary;

    public Employee() {
    }

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + '}';
    }

    abstract double calsalary();

    public void input() {
        System.out.print("Enter ID:");
        id = Validation.checkInputString();
        System.out.print("Enter Name:");
        name = Validation.checkInputString();
    }
    public void output(){
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Salary : "+calsalary());
    }
}
