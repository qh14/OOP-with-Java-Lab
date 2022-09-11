/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg26_fileformat;



/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        //"C:\Users\admin\Desktop\LAB211\27_FormatFile\test (1).csv"
        //C:\Users\admin\Desktop\LAB211\27_FormatFile\output.txt
        StandardizeFile standardize = new StandardizeFile();

        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    standardize.readFile();
                    break;
                case 2:
                    standardize.formatAddress();
                    break;
                case 3:
                    standardize.formatName();
                    break;
                case 4:
                    standardize.WriteContentToFile();
                    break;
                case 5:
                    return;

            }
        }
    }

}
