package Ć9_Z1;

import java.io.*;
import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        try (BufferedWriter bwriter = new BufferedWriter(new FileWriter(new File("1.txt")))){
            String line = "";
            while(!line.equals("stop ")){
                line = scn.nextLine()+" ";
                bwriter.write(line);
            }
            bwriter.flush();
        }
        catch (IOException e) {
            e.printStackTrace();

        }
    }
}
