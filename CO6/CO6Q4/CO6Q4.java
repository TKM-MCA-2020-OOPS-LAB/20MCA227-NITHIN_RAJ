//Write a program that reads from a file having integers. Copy even numbers and odd
//numbers to separate files. 
package javaprograms;

import java.io.*;


public class CO6Q4 {
    public static void main(String[] args) {
        try {
            String str;
            int n;
            FileReader fr = new FileReader("Integers.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fileEven = new FileWriter("Even.txt",true);
            FileWriter fileOdd = new FileWriter("Odd.txt",true);
            BufferedWriter bwEven = new BufferedWriter(fileEven);
            BufferedWriter bwOdd = new BufferedWriter(fileOdd);
            while((str=br.readLine())!=null)
            {
                n = Integer.parseInt(str);
                if(n%2==0)
                {
                    bwEven.write(String.valueOf(n));
                    bwEven.write("\n");
                    bwEven.flush();
                }
                else
                {
                    bwOdd.write(String.valueOf(n));
                    bwOdd.write("\n");
                    bwOdd.flush();
                }
            }
            System.out.println("Successfully Sorted");
        } catch (Exception e) {
        }
    }
}
