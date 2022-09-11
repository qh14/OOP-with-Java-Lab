/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB211_ManageGrocery;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
        ManageItem manageItem = new ManageItem();
        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    manageItem.addItem();
                    break;
                case 2:
                    manageItem.displayItem();
                    break;

                case 3:
                    manageItem.updateItem();
                    break;
                case 4:
                    manageItem.deleteItem();
                    break;
                case 5:

                    return;
            }
        }
    }
}
