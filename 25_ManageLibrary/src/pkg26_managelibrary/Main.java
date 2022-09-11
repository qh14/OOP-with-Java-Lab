/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg26_managelibrary;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ManageDocument documentList = new ManageDocument();
        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    documentList.addDocument();
                    break;
                case 2:
                    documentList.deleteDocument();
                    break;
                case 3:
                    documentList.printAll();
                    break;
                case 4:
                    documentList.updateDocument();
                    break;
                case 5:
                    return;
            }
        }
    }

}
