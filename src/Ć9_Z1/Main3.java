package Ć9_Z1;

import java.io.*;

public class Main3 {
    public static void main(String[] args) {

        try (BufferedReader breader = new BufferedReader(new FileReader(new File("t1.txt")))){

            String line;
            int charCount = 0;
            while((line = breader.readLine())!=null){
                charCount += line.length();
            }
            System.out.println(charCount);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
