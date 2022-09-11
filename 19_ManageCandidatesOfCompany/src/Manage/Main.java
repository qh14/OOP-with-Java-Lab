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
public class Main {

    public static void main(String[] args) {
        CandidateManage manage = new CandidateManage();
        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    manage.addCandidate(choice);
                    break;
                case 2:
                    manage.addCandidate(choice);
                    break;
                case 3:
                    manage.addCandidate(choice);
                    break;
                case 4 :
                    manage.findCandidate();
                    break;
                case 5 :
                    return;
               
            }
        }
    }
}
