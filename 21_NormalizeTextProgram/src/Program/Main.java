/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) throws Exception {
        NomalizeText newNomalizeText = new NomalizeText();
        newNomalizeText.WriteContentToFile("C:\\Users\\admin\\Desktop\\LAB211\\21_NormalizeTextProgram\\Output.txt",newNomalizeText.removeMoreSpaceText(newNomalizeText.readFile("C:\\Users\\admin\\Desktop\\LAB211\\21_NormalizeTextProgram\\Input.txt")));
    }
}
