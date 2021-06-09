package javaprograms;
//Write a user defined exception class to authenticate the user name and password

import java.util.Scanner;

class authException extends Exception
{

    public authException(String s) {
        super(s);
    }
    
}
public class CO4Q3 
{
    public static void main(String[] args) {
        String username = "admin";
        String passcode = "pass1234";
        String user_name,password;
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Enter the username:");
            user_name = sc.nextLine();
//            sc.nextLine();
            System.out.println("Enter the password:");
            password = sc.nextLine();
            if(username.equals(user_name) && passcode.equals(password))
            {
                System.out.println("Authentication successful...");
            }
            else
                throw new authException("Invalid user credentials");
            
        }
        catch(authException e)
        {
            System.out.println("Exception caught "+e);
        }
    }

}
