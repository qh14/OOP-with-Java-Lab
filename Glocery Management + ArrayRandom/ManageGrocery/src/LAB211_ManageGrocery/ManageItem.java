/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB211_ManageGrocery;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class ManageItem {
    ArrayList<Item> listItems = new ArrayList<>();
    public void addItem(){
        System.out.println("--------- Create Item ---------");
        System.out.print("Enter Code: ");
        String code = Validation.checkInputCode(listItems);
        System.out.print("Enter Name: ");
        String name = Validation.checkInputString();
        System.out.print("Enter Price: ");
        int price = Validation.checkInputPrice();
        Item newItem = new Item(code, name, price);
        listItems.add(newItem);
        System.out.println("Create successful!");
    }
    public void displayItem(){
        if (listItems.isEmpty()) {
            System.out.println("List Empty");
            return;
        }
        System.out.println("--------------------Items Information-----------------------");
        System.out.printf("%-7s%-20s%-15s\n","Code","Name","Price");
        for (Item listItem : listItems) {
            System.out.printf("%-5s%-20s%-15d\n",listItem.getCode(),listItem.getName(),listItem.getPrice());
        }
    }
    public int indexItem(String code){
        for (int i = 0; i < listItems.size(); i++) {
            if (listItems.get(i).getCode().equals(code)) {
                return i;
            }
            
        }
        return -1;
    }
    public void deleteItem(){
        System.out.print("Enter Code: ");
        String code = Validation.checkInputString();
        int index = indexItem(code);
        if (index == -1) {
            System.out.println("Not found");
            return;
        }
        listItems.remove(index);
        System.out.println("Delete successful!");
    }
    public void updateItem(){
        System.out.print("Enter Code: ");
        String code = Validation.checkInputString();
        int index = indexItem(code);
        if (index == -1) {
            System.out.println("Not found");
            return;
        }
        System.out.print("Enter New Code: ");
        String newcode = Validation.checkInputCode(listItems);
        System.out.print("Enter New Name: ");
        String newname = Validation.checkInputString();
        System.out.print("Enter New Price: ");
        int newprice = Validation.checkInputPrice();
        Item newItem = new Item(newcode, newname, newprice);
        listItems.set(index, newItem);
        System.out.println("Update Successful!");
    }
}
