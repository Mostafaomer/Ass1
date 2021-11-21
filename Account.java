package assignment._1;
import java.util.Date;
public class Account
{
 private int id;   
 private double balance;
 private double annualInteresrRate;
 private Date dateCreated;
 public Account()
 {
     id=0;
     balance=0;
     annualInteresrRate=0;
 }
    public int getId() 
    {
        return id;
    }
    public double getBalance() 
    {
        return balance;
    }
    public double getAnnualInteresrRate() 
    {
        return annualInteresrRate;
    }
    public void setId(int id) 
    {
        this.id = id;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public void setAnnualInteresrRate(double annualInteresrRate) 
    {
        this.annualInteresrRate = annualInteresrRate;
    }  
    public Date getDateCreated()
    {
        return dateCreated;
    }
     public double getMonthlyInteresrRate()
    {
        return annualInteresrRate/12;
    }
      public void withdraw(double amount)
      {
   if (amount < 0.0) {
       System.out.println("Cannot withdraw a negative amount");
   }
   else if (amount > balance) {
       System.out.println("Cannot withdraw an amount");
   }
   else
   {
   balance = balance - amount;

   System.out.println("Passed ,and your currunt amount is"+balance);
   }
 }
      
}