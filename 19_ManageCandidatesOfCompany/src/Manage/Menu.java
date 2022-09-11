/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manage;

/**
 *
 * @author admin
 */
public class Menu {

    public static int menu() {
        System.out.println("CANDIDATE MANAGEMENT SYSTEM\n"
                + "\t1. Experience\n"
                + "\t2. Fresher\n"
                + "\t3. Internship\n"
                + "\t4. Searching\n"
                + "\t5. Exit");
        System.out.println("(Please choose 1 to Create Experience Candidate, 2 to Create Fresher Candidate, 3 to Internship Candidate "
                + "4 to Searching and 5 to Exit program).");
        System.out.print("Enter your choice : ");
        int choice = Validation.checkInputIntLimit(1, 5);
        return choice;
    }
}
