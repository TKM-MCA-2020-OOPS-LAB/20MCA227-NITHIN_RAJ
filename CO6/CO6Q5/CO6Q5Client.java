//Client server communication using Socket – TCP/IP 
package javaprograms;
import java.net.*;
import java.io.*;

public class CO6Q5Client {
    public static void main(String args[]) throws Exception{
    try {
	Socket s = new Socket ("localhost", 5555);
	PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
	pw.println("Hello Server!");		
        InputStreamReader isr = new InputStreamReader(s.getInputStream());
	BufferedReader br = new BufferedReader(isr);
	String str= br.readLine();
	System.out.println("Message from Server: "+str);
	pw.close();
	s.close();					
	}
	catch(Exception e) 
        {
            System.out.println("An error occured..." +e);	
	}
    }
}
