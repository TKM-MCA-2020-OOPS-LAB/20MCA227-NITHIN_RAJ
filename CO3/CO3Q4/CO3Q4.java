//Write a program has class Publisher, Book, Literature and Fiction. Read the information
//and print the details of books from either the category, using inheritance. 
package javaprograms;

import java.util.Scanner;


public class CO3Q4 
{
    public class publisher
    {
        String pub_name;
        publisher(){}
        publisher(String name)
        {
            pub_name = name;
        }
    }
   static public class Book extends publisher
    {
        String book_name;
        Book(){}
        Book(String bname, String pname)
        {
            super(pname);
            book_name = bname;
        }
        public void display()
        {
            System.out.println("\n\n**********\n\nBook Details");
            System.out.println("Publisher:"+ pub_name);
            System.out.println("Book:"+book_name);
        }
    }
    static public class literature extends Book
    {
        String book_genre;

        public literature() {}
        literature(String name,String book,String genre)
        {
            super(name,book);
            book_genre = genre;
            super.display();
            System.out.println("Genre:"+book_genre);
        }
        
    }
    static public class fiction extends Book
    {
        String book_genre;
        fiction(){}
        fiction(String name,String book,String genre)
        {
            super(name,book);
            book_genre = genre;
            super.display();
            System.out.println("Genre:"+book_genre);
        }
    }
    
    
    public static void main(String[] args) 
    {
        String name,book,genre;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the book details...");
        System.out.println("Enter the Book name:");
        book = sc.nextLine();
        System.out.println("Enter the Publisher name:");
        name = sc.nextLine();
        System.out.println("Enter the Genre name:");
        genre = sc.nextLine();
        fiction obj;
        literature ob;
        if(genre.toLowerCase().equals("fiction"))
        {
            obj = new fiction(name,book,genre); 
        }
        else if(genre.toLowerCase().equals("literature"))
            ob = new literature(name,book,genre);
        else
            System.out.println("Enter Fiction or Literature");
    }
}
