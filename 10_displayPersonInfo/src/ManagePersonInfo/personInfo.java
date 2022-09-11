/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagePersonInfo;

/**
 *
 * @author admin
 */
public class personInfo implements Comparable<personInfo>{

    private String name;
    private String address;
    private double salary;

    public personInfo() {
    }

    public personInfo(String name, String address, double salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "personInfo{" + "name=" + name + ", address=" + address + ", salary=" + salary + '}';
    }

    @Override
    public int compareTo(personInfo o) {
        return (int) (this.getSalary() - o.getSalary());
    }
    
}
