package com.java.study.task1_decoder;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\user\\IdeaProjects\\Java_Lesson13_Regular_expressions_and_Data_API\\src\\com\\java\\study\\task1\\test.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String regex = "\\sin(\\w*)\\s|\\snear(\\w*)\\s|\\sat(\\w*)\\s|\\sfrom(\\w*)\\s|\\sto(\\w*)\\s|\\sof(\\w*)\\s|\\son(\\w*)\\s|\\swith(\\w*)\\s";
        String temp = null;
        while ((temp = bufferedReader.readLine()) != null){
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(temp);
            System.out.println(matcher.replaceAll(" Java "));

        }

    }
}
