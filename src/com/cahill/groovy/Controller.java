package com.cahill.groovy;

import java.io.IOException;
import java.util.Scanner;

public class Controller {
    public static void console(){
        System.out.println("Program now ending...");

        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter the path for your JSON file: ");

        String JSON_Path = myObj.nextLine();
        System.out.println("You have entered the path " + JSON_Path);
        System.out.println("Loading...");

        try {
            MyFile.getFile(JSON_Path);
        } catch (IOException e) {
            System.out.println("There was an error accessing your file.");
            e.printStackTrace();
        }


    }
}
