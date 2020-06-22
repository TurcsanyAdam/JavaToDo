package com.helloworld;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        FileWriter myWriter = new FileWriter("filename.txt",true);
        File myObj = new File("filename.txt");
        Scanner myReader = new Scanner(myObj);

        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
        while(!input.equals("quit")){
            System.out.print("To do: ");
            input = scanner.nextLine();
            if(input.equals("")){
                System.out.print("Please enter a task");
                continue;
            }
            if(!input.equals("quit")){
                myWriter.write(input + "\n");
            }
        }
        myWriter.close();

    }
}
