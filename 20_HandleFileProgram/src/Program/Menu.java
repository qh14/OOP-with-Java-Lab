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
public class Menu {

    public static int menu() {
        System.out.println("===================== File Processing ======================");
        System.out.println("1. Check Path\n"
                + "2.Get file name with type java\n"
                + "3. Get file with size greater than input\n"
                + "4. Wirte more content to file\n"
                + "5. Read file and count letter\n"
                + "6.Quit\n");
        System.out.print("Please choose one option : ");
        int option = Validation.checkInputIntLimit(1, 6);
        return option;
    }
}
