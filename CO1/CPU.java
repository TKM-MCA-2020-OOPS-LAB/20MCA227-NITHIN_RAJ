package javaprograms;

import java.util.Scanner;

public class CPU {
    double price;
        public class processor
        {
            float cores;
            String mfg;
            void display(float n, String pname)
            {
                cores = n;
                mfg = pname;
                System.out.println("The processor has "+cores+" cores from the "+mfg+" manufacturer");
            }
        }
            static class RAM
            {
                float mem;
                String mfg;
                void display(float n, String pname)
                {
                    mem = n;
                    mfg = pname;
                    System.out.println("RAM memory is "+mem+" and the manufacturer is "+mfg);
                }
            }
                public static void main(String[] args) 
                {
                    CPU obj = new CPU();
                    CPU.processor obj1 = obj.new processor();
                    CPU.RAM obj2 = new CPU.RAM();
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter the price of the CPU:");
                    obj.price = sc.nextDouble();
                    System.out.println("Processor Details:-");
                    System.out.println("Enter the number of cores:");
                    float c = sc.nextFloat();
                    sc.nextLine();
                    System.out.println("Enter the processor name:");
                    String pname = sc.nextLine();
                    
                    System.out.println("Enter RAM details:-");
                    System.out.println("Enter the size of the RAM:");
                    float mem = sc.nextFloat();
                    sc.nextLine();
                    System.out.println("Enter the Manufacturer:");
                    String mfg = sc.nextLine();
                    
                    System.out.println("Price of the CPU is "+obj.price);
                    obj1.display(c, pname);
                    obj2.display(mem, mfg);
                    
                }
            
        
}
