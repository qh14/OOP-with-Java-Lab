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
public class EmployeeManage {
    ArrayList<Employee> list = new ArrayList<>();
    public void add(){
        System.out.println("1 - Lecturer Class");
        System.out.println("2 - Officer Class");
        System.out.print("Enter your choice : ");
        int choice = Validation.checkInputIntLimit(1, 2);
        switch (choice) {
            case 1:
                LecturerClass newLecturer = new LecturerClass();
                newLecturer.input();
                list.add(newLecturer);
                break;
            case 2:
                OfficerClass newOfficer = new OfficerClass();
                newOfficer.input();
                list.add(newOfficer);
                break;
        }
        
    }
    public void display(){
        System.out.printf("%-15s%-15s%-15s\n","ID","Name","Salary");
        for (Employee employee : list) {
            System.out.printf("%-15s%-15s%-30.1f\n",employee.getId(),employee.getName(),employee.calsalary());
        }
    }
}
