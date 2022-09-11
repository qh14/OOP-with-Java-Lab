/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagePersonInfo;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author admin
 */
public class PersonInfoManage {
    ArrayList<personInfo> list = new ArrayList<>();
    public void inputPersonInfo(){
        System.out.println("Input Information of Person");
        System.out.print("Please input name: ");
        String name = Validation.checkInputString();
        System.out.print("Please input address: ");
        String address = Validation.checkInputString();
        System.out.print("Please input salary: ");
        double salary = Validation.checkInputSalary();
        personInfo p = new personInfo(name, address, salary);
        list.add(p);
        
    }
    public void showInfo(){
        Collections.sort(list);
        for (int i = 0; i < 3; i++) {
            System.out.println("Information of Person you have entered: ");
            System.out.println("Name : "+list.get(i).getName());
            System.out.println("Address : "+list.get(i).getAddress());
            System.out.println("Salary : "+list.get(i).getSalary());
            System.out.println("");
        }
    }
}
