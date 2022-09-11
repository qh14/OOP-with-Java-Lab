/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author admin
 */
public class NomalizeText {
    public String readFile(String path) throws FileNotFoundException, IOException {
        String newString = "";
        try (
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            int i;
            while ((i = bufferedReader.read()) != -1) {
                newString = newString + (char) i;
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return newString;
    }

    public String removeMoreSpaceText(String string) {
        string = string.toLowerCase();
        string = string.replaceAll("\\ +", " ");
        string = string.replaceAll("[\\r\\n]+", "\n");
        string = string.replaceAll(" +\\.", ".");
        string = string.replaceAll(" +,", ",");
        string = string.replaceAll(" +[:]", ":");
        string = string.replaceAll("[.]( *)", ". ");
        string = string.replaceAll("[,]( *)", ", ");
        string = string.replaceAll("[:]( *)", ": ");
        string = uppercaseFirst(string);
        String firstLetter = string.substring(0, 1);
        String remainingLetters = string.substring(1, string.length());
        firstLetter = firstLetter.toUpperCase();
        string = firstLetter + remainingLetters;
        Pattern pattern = Pattern.compile("[\\.\\?\\:] \\w");
        Matcher matcher = pattern.matcher(string);
        StringBuilder builder = new StringBuilder(string);
        while (matcher.find()) {
            int index = matcher.end() - 1;
            builder.setCharAt(index,Character.toUpperCase(builder.charAt(index)));
        }
        string = builder.toString();
        string = noSpaceQuotes(string);
        string = addDot(string);
        return string;
    }
    public static int count = 0;

    public String noSpaceQuotes(String line) {
        StringBuilder builder= new StringBuilder(line);
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == '\"' && count % 2 == 0&&builder.charAt(i + 1) == ' ') {
                builder.deleteCharAt(i + 1);
                if (builder.charAt(i - 1) != ' ') {
                    builder.insert(i-1, " ");
                }
                count++;
            } else if (builder.charAt(i) == '\"' && count % 2 == 1 && i != 0 && builder.charAt(i - 1) == ' ') {
                builder.deleteCharAt(i - 1);
                if (builder.charAt(i + 1) != ' ') {
                    builder.insert(i+1, " ");
                }
                
                count++;
            }
        }
        return builder.toString();
    }
    public String addDot(String line) {
        StringBuilder builder= new StringBuilder(line);
        for (int i = 0; i < builder.length(); i++) {
            if (Character.isLetter(builder.charAt(i)) &&builder.charAt(i + 1) == '\n' && Character.isUpperCase(builder.charAt(i+2))) {
                    builder.insert(i+1, ".");
            } 
        }
        return builder.toString();
    }
    public String uppercaseFirst(String line) {
        StringBuilder builder= new StringBuilder(line);
        for (int i = 0; i < builder.length()-1; i++) {
            if (builder.charAt(i) == '\n' && Character.isLowerCase(builder.charAt(i+1)) ) {
                    builder.setCharAt(i+1,Character.toUpperCase(builder.charAt(i+1)));
            } 
        }
        return builder.toString();
    }

    public void WriteContentToFile(String path, String string) throws Exception {
        File file = new File(path);
        boolean fileExist = file.exists();
        if (fileExist && file.isFile()) {
            try ( BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.append(string);
            }
        } else {
            System.out.println("Path isn't Exist");
        }

    }
}
