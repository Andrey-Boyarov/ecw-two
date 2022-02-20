package com.company;

import java.io.BufferedReader;
import java.io.FileReader;

public class Utils {
    public static BufferedReader read(){
        try{
            return new BufferedReader(new FileReader("src/com/company/test.txt"));
        } catch (Exception e) {e.printStackTrace();}
        return null;
    }

    public static BufferedReader empty(){
        try{
            return new BufferedReader(new FileReader("src/com/company/empty.txt"));
        } catch (Exception e) {e.printStackTrace();}
        return null;
    }
}
