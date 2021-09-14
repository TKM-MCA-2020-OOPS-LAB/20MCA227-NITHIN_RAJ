
package javaprograms;

import java.io.File;
import java.util.Scanner;

public class CO6Q1 {
    public static void main(String[] args) {
        int flag=0;
        File f = new File("../");
        Scanner sc = new Scanner(System.in);
        String name,filename;
        String[] filelist = f.list();
        try{
        for(String str: filelist)
            System.out.println(str);
        System.out.println("**********");
        System.out.println("Enter the file name to search:");
        name = sc.nextLine();
        for(int i =0; i<f.length();i++)
        {
            filename = filelist[i];
            if(filename.equals(name))
            {
                flag=1;
                break;
            }
            else
                flag=0;
        }
        }
        catch(Exception e)
        {
        if(flag==1)
            System.out.println("File found");
        else
            System.out.println("File not found");
        }
    }
}
