package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        //Pattern p1 = Pattern.compile("\"[^\"]*+\""); // обычный поиск "ковычек"
        //Pattern p1 = Pattern.compile("\".*\""); // он жадный поэтому запомнит что нашёл
        Pattern p1 = Pattern.compile("\".*+\""); // он не жадный поэтому забудет что нашёл
        Matcher m1 = p1.matcher("\"abc\"x");
        while (m1.find()){
            System.out.println(m1.start() +" "+ m1.group()+" ");
        }
    }
}
