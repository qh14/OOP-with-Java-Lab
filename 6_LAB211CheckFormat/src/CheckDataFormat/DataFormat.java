/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CheckDataFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author admin
 */
public class DataFormat {
    public boolean isValidPhoneNumber() {
        System.out.print("Phone Number : ");
        String s = Validation.checkInputString();
        if (!Validation.isNumeric(s)) {
            System.out.print("Enter Number again : ");
            return false;
        }
        final String regex = "^0\\d{9}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        if (!m.matches()) {
            System.out.println("Invalid Number");
            System.out.println("Input phone number must contain 10 numbers.");
        }
        
        return (m.matches());
    }

    public boolean isValidEmail() {
        System.out.print("Email : ");
        String email = Validation.checkInputString();
        final String regex = "^(.+)@(.[A-Za-z]+)+\\.([A-Za-z]{2,4})$";
        final Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(email);
        return (m.matches());
    }

    public boolean isValidDate() {
        SimpleDateFormat formatDate = new SimpleDateFormat("MM/dd/yyyy");
        formatDate.setLenient(false);
        System.out.print("Date : ");
        String s = Validation.checkInputString();
        try {
            Date date = formatDate.parse(s);
            
        } catch (Exception e) {
            
            return false;
        }
        return true;
    }
}
