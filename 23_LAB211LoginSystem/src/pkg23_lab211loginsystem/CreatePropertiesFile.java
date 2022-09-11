/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg23_lab211loginsystem;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

/**
 *
 * @author admin
 */
public class CreatePropertiesFile {

    public static void create() {
        Properties prop = new Properties();
        OutputStream output = null;
        try {
            output = new FileOutputStream("MessageBundle_en_EN.properties");
            prop.setProperty("accNum", "Account Number : ");
            prop.setProperty("pass", "Password : ");
            prop.setProperty("cap", "CapChar");
            prop.setProperty("entercap", "Enter CapChar : ");
            prop.setProperty("errorAccNum", "Account Number is number with minimum 10 characters");
            prop.setProperty("errorPass", "Password must be between 8 and 31 characters and must be alphanumeric");
            prop.setProperty("errorCap", "Captcha incorrect");
            prop.store(output, null);
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
     public static void createVi() {
        Properties prop = new Properties();
        OutputStream output = null;
        try {
            output = new FileOutputStream("MessageBundle_vi_VI.properties");
            prop.setProperty("accNum", "So tai khoan : ");
            prop.setProperty("pass", "Mat khau : ");
            prop.setProperty("cap", "CaptChar: ");
            prop.setProperty("cap", "Nhap CapChar: ");
            prop.setProperty("errorAccNum", "So tai khoan phai la 1 so va phai co 10 chu so");
            prop.setProperty("errorPass", "Mat khau phai trong khoang 8-31 ky tu va phai chua ky tu va so");
            prop.setProperty("errorCap", "Captcha sai");
            prop.store(output, null);
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
