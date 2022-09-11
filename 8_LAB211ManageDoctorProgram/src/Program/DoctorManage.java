/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class DoctorManage {

    ArrayList<Doctor> list = new ArrayList<>();

    public Doctor enterDoctor() {
        System.out.print("Enter Code : ");
        String newCode = Validation.checkInputString();
        System.out.print("Enter name : ");
        String name = Validation.checkInputString();
        System.out.print("Enter specialization : ");
        String specialization = Validation.checkInputString();
        System.out.print("Enter availability : ");
        int availability = Validation.checkInputInt();
        Doctor doctor = new Doctor(newCode, name, specialization, availability);
        return doctor;
    }

    public void addDoctor() {
        System.out.println("---------------- Add Doctor -----------------");
        list.add(enterDoctor());
        
    }

    public int findIndex(String code) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode().equalsIgnoreCase(code)) {
                return i;
            }

        }
        return -1;
    }

    public void updateDoctor() {
        System.out.println("---------------- Update Doctor -----------------");

        System.out.print("Enter code to update : ");
        String code = Validation.checkInputString();
        int n = findIndex(code);
        if (n == -1) {
            System.out.println("Cann't find this code ");
            System.out.println("Enter again.");
            return;
        } else {
            list.set(n, enterDoctor());
        }

    }

    public void deleteDoctor() {
        System.out.println("---------------- Delete Doctor -----------------");
        boolean userchoice = true;

        System.out.print("Enter code : ");
        String code = Validation.checkInputString();
        int n = findIndex(code);
        if (n == -1) {
            System.out.println("Cann't find this code ");
            return;
        } else {
            list.remove(n);
        }

    }

    public void display() {
        System.out.printf("%-10s%-15s%-25s%-20s\n", "Code",
                "Name", "Specialization",
                "Availability");
        for (int i = 0; i < list.size(); i++) {
            list.get(i).display();

        }
    }
}
