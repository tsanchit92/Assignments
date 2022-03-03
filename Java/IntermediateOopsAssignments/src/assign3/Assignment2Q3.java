package assign3;

import java.util.ArrayList;

class CurrentAccount extends Assignment2Q3 
{
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() 
    {
    	int total_cash;
    	total_cash=totalDeposits-creditLimit;
    	return total_cash;
    }
}
class SavingsAccount extends Assignment2Q3 
{
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash()
    {
    	int total_cash;
    	total_cash=totalDeposits+fixedDepositAmount;
    	return total_cash;
    }
}
public class Assignment2Q3 
{
    public int totalCashInBank(ArrayList<Integer> cash)
    {
    	int sum=0;
    	for(int i=0;i<cash.size();i++)
    		sum+=cash.get(i);
    	return sum; 
    }
    public int getCash()
    {
    	int total_cash = 0;
    	return total_cash;
    }
    public static void main(String[] args) 
    {
    	CurrentAccount c=new CurrentAccount();
    	SavingsAccount s=new SavingsAccount();
    	int a=c.getCash();
    	int b=s.getCash();
    	System.out.println("Total Current Account Amount "+a);
    	System.out.println("Total Savings Account Amount "+b);
    	ArrayList<Integer> cash=new ArrayList<Integer>();
    	cash.add(a);
    	cash.add(b);
    	Assignment2Q3 total=new Assignment2Q3();
    	System.out.println("Total amount in the bank "+total.totalCashInBank(cash));
    	
    }
}
