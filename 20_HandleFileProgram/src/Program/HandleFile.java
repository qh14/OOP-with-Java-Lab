/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class HandleFile {

    //1. Check Path
    public void checkInputPath() throws Exception {
        System.out.println("------------- Check Path -------------");
        System.out.print("Enter path : ");
        String path = Validation.checkInputString();
        File file = new File(path);
        boolean fileExist = file.exists();
        if (fileExist) {
            if (file.isFile()) {
                System.out.println("Path to file");
            } else if (file.isDirectory()) {
                System.out.println("Path to directory");
            }
        } else {
            System.out.println("Path isn't Exist");
        }
    }

    //2.Check File Java
    public void getAllFileNameJavaInDirectory() throws Exception {
        ArrayList<String> listName = new ArrayList<>();
        System.out.println("------------- Get All File Name Java In Directory -------------");
        System.out.print("Enter path : ");
        String path = Validation.checkInputString();
        File file = new File(path);
        boolean fileExist = file.exists();
        if (fileExist && file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile() && files[i].getName().endsWith(".java")) {
                    listName.add(files[i].getName());
                }

            }
        } else {
            System.out.println("Path isn't Exist");
        }
        System.out.println("Result " + listName.size() + " files");
        for (int i = 0; i < listName.size(); i++) {
            System.out.println(listName.get(i));
        }
    }

    //3.getFileWithSizeGreaterThanInput
    public void getFileWithSizeGreaterThanInput() throws Exception {
        ArrayList<String> listName = new ArrayList<>();
        int KB = 1024; 
        System.out.println("------------------------ Get File With Size Greater Than Input------------------------");
        System.out.print("Enter size: ");
        int size = Validation.checkInputSize();
        System.out.print("Enter path : ");
        String path = Validation.checkInputString();
        File file = new File(path);
        boolean fileExist = file.exists();
        if (fileExist && file.isDirectory()) {
            File[] files = file.listFiles();

            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile() && files[i].length() > size*KB) {
                    listName.add(files[i].getName());
                }

            }
        } else {
            System.out.println("Path isn't Exist");
        }
        System.out.println("Result " + listName.size() + " files");
        for (int i = 0; i < listName.size(); i++) {
            System.out.println(listName.get(i));
        }
    }

    public void appendContentToFile() throws Exception {
        System.out.println("------------------------ Write More Content To File -----------------------");
        System.out.print("Enter Content : ");
        String content = Validation.checkInputString();
        System.out.print("Enter path : ");
        String path = Validation.checkInputString();
        File file = new File(path);
        boolean fileExist = file.exists();
        if (fileExist && file.isFile()) {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            writer.append(' ');
            writer.append(content);

            writer.close();
        } else {
            System.out.println("Path isn't Exist");
        }

    }

    public int countWord() throws Exception {
        System.out.println("------------------------ Count File  -----------------------");

        System.out.print("Enter path : ");
        String path = Validation.checkInputString();
        File file = new File(path);
        boolean fileExist = file.exists();
        if (fileExist && file.isFile()) {
            FileInputStream fis = new FileInputStream(file);
            byte[] byteArray = new byte[(int) file.length()];
            fis.read(byteArray);
            String s = new String(byteArray);
            String[] data = s.split(" ");
            return data.length;
        } else {
            System.out.println("Path isn't Exist");
            return -1;
        }
        
    }
}
