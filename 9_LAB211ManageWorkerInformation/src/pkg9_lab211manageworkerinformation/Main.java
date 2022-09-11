/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9_lab211manageworkerinformation;

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
        ManageWorker manageWorker = new ManageWorker();

        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    manageWorker.AddWorker();
                    break;
                case 2:
                    manageWorker.changeSalary("UP");
                    break;
                case 3:
                    manageWorker.changeSalary("DOWN");
                    break;
                case 4:
                    manageWorker.getInformationSalaryHistory();
                    break;
                case 5:
                    return;
                    
            }
        }

    }
}
