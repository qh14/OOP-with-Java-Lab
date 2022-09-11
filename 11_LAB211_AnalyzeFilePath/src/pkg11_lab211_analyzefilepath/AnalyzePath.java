/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_lab211_analyzefilepath;

import java.util.StringTokenizer;

/**
 *
 * @author admin
 */
public class AnalyzePath {

    public String getPath(String path) {
        int fromDisk = path.indexOf("\\");
        int toFile = path.lastIndexOf("\\");
        String valuePath = path.substring(fromDisk + 1, toFile);
        return valuePath;
    }

    public String getFileName(String path) {
        int beginNameFile = path.lastIndexOf("\\");
        int endNameFile = path.lastIndexOf(".");
        if (beginNameFile == -1 || endNameFile == -1) {
            return "";
        }
        String valueName = path.substring(beginNameFile + 1, endNameFile);
        return valueName;
    }

    public String getExtension(String path) {
        int beginExtension = path.lastIndexOf(".");
        int endExtension = path.length();
        if (beginExtension == -1) {
            return "";
        }
        String valueExtension = path.substring(beginExtension, endExtension);
        return valueExtension;
    }

    public String getDisk(String path) {
        int endDisk = path.indexOf("\\");
        String valueDisk = path.substring(0, endDisk + 1);
        return valueDisk;
    }


    public String getFolder(String path) {
        int position = path.indexOf("\\");
        int lastPosition = path.lastIndexOf("\\");
        path = path.substring(0,lastPosition);
        StringTokenizer st = new StringTokenizer(path,"\\");
        String tmp = null;
        while (st.hasMoreTokens()){
            tmp = st.nextToken();
        }
        return tmp;
    }
    
}