/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg26_fileformat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class StandardizeFile {

    ArrayList<CSVFile> list = new ArrayList<>();

    public void readFile() {
        System.out.println("--------- Import CSV -------");
        System.out.print("Enter path : ");
        String path = Validation.checkInputString();
        File file = new File(path);
        boolean fileExist = file.exists();
        if (!fileExist) {
            System.out.println("Path isn't Exist");
            return;
        }
        String newline = "";
        try (
                 BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            while ((newline = bufferedReader.readLine()) != null) {
                String[] listCSV = newline.split(",");
                list.add(new CSVFile(listCSV[0], listCSV[1], listCSV[2], listCSV[3], listCSV[4]));
            }
            System.out.println("Import: Done");

        } catch (Exception e) {
            System.err.println(e);
        }

    }

    public void WriteContentToFile() throws Exception {
        System.out.println("------- Export CSV ------");
        System.out.print("Enter path : ");
        String path = Validation.checkInputString();
        File file = new File(path);
        boolean fileExist = file.exists();
        if (!fileExist) {
            System.out.println("Path isn't Exist");
        }
        try ( BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < list.size(); i++) {
                {
                    writer.append(list.get(i).toString() + "\n");
                }

            }
            System.out.println("Export: Done");
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void formatAddress() {
        System.out.println("--------- Format Address -------");
        for (int i = 0; i < list.size(); i++) {
            String address = list.get(i).getAddress();
            address = address.replaceAll("\\s+", " ");
            list.get(i).setAddress(address);
        }
        System.out.println("Format: Done");
    }

    public void formatName() {
        System.out.println("--------- Format Name -------");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i).getName();
            name = name.replaceAll("\\s+", " ");
            name = name.toLowerCase();
            String[] arr = name.split(" ");
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < arr.length; j++) {
                sb.append(Character.toUpperCase(arr[j].charAt(0))).append(arr[j].substring(1)).append(" ");
                name = sb.toString().trim();
            }
            list.get(i).setName(name);
        }
        System.out.println("Format: Done");
    }
}
