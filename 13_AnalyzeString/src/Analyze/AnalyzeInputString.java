/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analyze;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author admin
 */
public class AnalyzeInputString {
    public HashMap <String, String>getCharacter(String inputString){
        HashMap<String,String> value = new HashMap<>();
        inputString = inputString.replaceAll("\\t", "");
        String uppercase = inputString.replaceAll("\\W|[0-9]|[a-z]", "");
        String lowercase = inputString.replaceAll("\\W|[0-9]|[A-Z]", "");
        String specialCharacter = inputString.replaceAll("\\w", "");
        String allCharacter = inputString.replaceAll("\\W", "");
        value.put("Uppercase : ", uppercase);
        value.put("Lowercase :", lowercase);
        value.put("Special Character : ", specialCharacter);
        value.put("All Character : ", allCharacter);
        return value;
    }
    public HashMap <String, List<Integer>> getNumber(String inputString){
        HashMap <String, List<Integer>> getNumber = new HashMap<>();
        ArrayList<Integer>  listSquareNumber = new ArrayList<>();
        ArrayList<Integer>  listOddNumber = new ArrayList<>();
        ArrayList<Integer>  listEvenNumber = new ArrayList<>();
        ArrayList<Integer>  listAllNumber = new ArrayList<>();
        String number = inputString.replaceAll("\\D", ",");
        
        String[] listnumber = number.split(",");
        int lengthList = listnumber.length;
        
        for (int i = 0; i < lengthList; i++) {
            int numberList = 0;
            if (listnumber[i] != "") {
                numberList = Integer.parseInt(listnumber[i]);
                
            }else{
                continue;
            }
            if (numberList % 2 ==0 ) {
                listEvenNumber.add(numberList);
            }else {
                listOddNumber.add(numberList);
            }
            if (Validation.checkSquareNumber(numberList)) {
                listSquareNumber.add(numberList);
            }
            listAllNumber.add(numberList);
            
        }
        getNumber.put("List Square Number : ", listSquareNumber);
        getNumber.put("List Odd Number : ", listOddNumber);
        getNumber.put("List Even Number : ", listEvenNumber);
        getNumber.put("All Number : ", listAllNumber);
       return getNumber;
        
    }
    public void printNumber(HashMap <String, List<Integer>> hashmap ){
        for (Map.Entry map : hashmap.entrySet()) {
            System.out.println(map.getKey()+" "+map.getValue());
        }
    }
    public void printCharacter(HashMap <String,String> hashmap ){
        for (Map.Entry map : hashmap.entrySet()) {
            System.out.println(map.getKey()+" "+map.getValue());
        }
    }
}
