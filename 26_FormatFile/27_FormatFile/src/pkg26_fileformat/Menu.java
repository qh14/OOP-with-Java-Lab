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
public class Menu {

    public static int menu() {
        System.out.print("======= Format CSV Program =======\n"
                + "1. Import CSV\n"
                + "2. Format Address\n"
                + "3. Format Name\n"
                + "4. Export CSV\n"
                + "5. Exit\n"
                + "Please choice one option:");
        int choice = Validation.checkInputIntLimit(1, 5);
        return choice;
    }
}
