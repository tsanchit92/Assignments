package assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BankAccountTest 
{
	BankAccount a;
	@BeforeEach
	void init()
	{
		a=new BankAccount();
	}
	@DisplayName("Withdrawing money")
	@Test
	void test() 
	{
		
		assertThrows(InsufficientBalanceException.class,()-> a.withdraw(56000.00), "CHECK YOUR BALLANCE AND TRY AGAIN"); 
	}
	@DisplayName("Withdrawing money")
	@Test
	void test1()
	{
		try 
		{
			assertEquals(54500,a.withdraw(500),"Success");
		}
		catch(InsufficientBalanceException e)
		{
			System.out.println("enter amount again");
		}
	}
		
		
}



