/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

/**
 *
 * @author admin
 */
public class Main {
     public static void main(String[] args) {
        DoctorManage doctorManage = new DoctorManage();
         
        while (true) {
            Menu.menu();
            System.out.print("Enter your choice : ");
            int choice = Validation.checkInputInt();
            switch (choice) {
                case 1:
                    doctorManage.addDoctor();
                    break;
                case 2:
                    doctorManage.updateDoctor();
                    break;
                case 3:
                    doctorManage.deleteDoctor();
                    break;
                case 4:
                    doctorManage.display();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Please enter again.");
            }

        }

    }
}
