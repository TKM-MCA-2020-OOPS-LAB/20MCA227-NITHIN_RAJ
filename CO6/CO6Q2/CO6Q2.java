//Write a program to write to a file, then read from the file and display the contents on the
//console. 
package javaprograms;
import java.io.*;

public class CO6Q2 {
    public static void main(String[] args) {
        try
        {
            String str;
            FileWriter fw = new FileWriter("text.txt",true);
            fw.write("Hello this is a text file");
            fw.close();
            FileReader fr = new FileReader("text.txt");
            BufferedReader br = new BufferedReader(fr);
            System.out.println("Reading from the text.txt");
            while((str=br.readLine())!=null)
                System.out.println(str);
            
        }
        catch(Exception e)
        {
        
        }
    }
}
