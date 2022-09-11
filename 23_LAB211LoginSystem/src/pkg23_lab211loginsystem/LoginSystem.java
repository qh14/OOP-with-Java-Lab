/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg23_lab211loginsystem;

import java.util.ArrayList;
import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author admin
 */
public class LoginSystem {

    ArrayList<String> list = new ArrayList<>();

    public void login(int choice) {
        Locale localeEn = new Locale("en");
        Locale localeVi = new Locale("vi");
        String accNum;
        String password;
        String captcha;
        String cap = null;
        boolean validCap = false;
        ResourceBundle labels ;
        switch (choice) {

            case 1:
                labels = ResourceBundle.getBundle("pkg23_lab211loginsystem.MessageBundle_vi_VI", localeVi);
                System.out.print(labels.getString("accNum"));
                accNum = Vaildation.checkInputAccountNumber(choice);
                System.out.print(labels.getString("pass"));
                password = Vaildation.checkPassWord(choice);
                while (!validCap) {
                    cap = Vaildation.generateCap();
                    System.out.print(labels.getString("cap")+cap+"\n");                    
                    System.out.print(labels.getString("entercap"));
                    captcha = Vaildation.checkInputString();
                    validCap = Vaildation.checkcap(cap, captcha, choice);
                }
                break;

            case 2:
                
                labels = ResourceBundle.getBundle("pkg23_lab211loginsystem.MessageBundle_en_EN", localeEn);
                System.out.print(labels.getString("accNum"));
                accNum = Vaildation.checkInputAccountNumber(choice);
                System.out.print(labels.getString("pass"));
                password = Vaildation.checkPassWord(choice);
                while (!validCap) {
                    cap = Vaildation.generateCap();
                    System.out.print(labels.getString("cap")+cap+"\n");                    
                    System.out.print(labels.getString("entercap"));
                    captcha = Vaildation.checkInputString();
                    validCap = Vaildation.checkcap(cap, captcha, choice);
                }
                break;
        }
    }
}
