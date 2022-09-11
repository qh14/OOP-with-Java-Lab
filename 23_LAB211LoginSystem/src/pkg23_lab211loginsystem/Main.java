/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg23_lab211loginsystem;

import java.util.Locale;
import java.util.ResourceBundle;

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
        LoginSystem loginSystem= new LoginSystem();
        
        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    loginSystem.login(choice);
                    break;
                case 2 :
                    loginSystem.login(choice);
                    break;
                case 3 :
                    return;
            }
        }
    }

}
