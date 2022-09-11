/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_lab211_analyzefilepath;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        AnalyzePath analyzePath = new AnalyzePath();
        // TODO code application logic here
        System.out.print("Please input Path: ");
        String path = Validation.checkInputString();
        System.out.println("----- Result Analysis -----");
        System.out.print("Disk : " + analyzePath.getDisk(path));
        System.out.print("\nExtension : " + analyzePath.getExtension(path));
        System.out.print("\nFile Name : " + analyzePath.getFileName(path));
        System.out.print("\nPath : " + analyzePath.getPath(path));
        System.out.print("\nFolders : [" + analyzePath.getFolder(path)+"]");
        System.out.println("");

    }

}
