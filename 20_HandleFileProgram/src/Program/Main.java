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
    
    public static void main(String[] args) throws Exception {
        HandleFile handleFile = new HandleFile();
        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    handleFile.checkInputPath();
                    break;
                case 2:
                    handleFile.getAllFileNameJavaInDirectory();
                    break;
                case 3:
                    handleFile.getFileWithSizeGreaterThanInput();
                    break;
                case 4:
                    handleFile.appendContentToFile();
                    break;
                case 5:
                    int count = handleFile.countWord();
                    if (count != -1) {
                        System.out.println("Total : "+count);
                    }
                    break;
                case 6:

                    return;
                
                
            }
        }
    }
}
