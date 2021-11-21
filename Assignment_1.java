package assignment._1;

import java.util.Scanner;

public class Assignment_1 
{
    public static void main(String[] args) 
    {
   Account ac=new Account();
        System.out.println("Enter Yout amount");
        Scanner s=new Scanner(System.in);
        ac.setBalance(6500);
        double amount=s.nextDouble();
        ac.withdraw(amount);
   }
}
