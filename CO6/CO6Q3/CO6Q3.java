//Write a program to copy one file to another. 
package javaprograms;

import java.io.*;
import java.util.*;

public class CO6Q3 {
    public static void main(String[] args) {
        try {
            String str;
            FileReader fr = new FileReader("Sample1.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("Sample2.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            while((str=br.readLine())!=null)
            {
                fw.write(str);
                fw.flush();
            }
            System.out.println("File copied successfully");
        } 
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
