package assignment;

class InsufficientBalanceException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientBalanceException(String message)
	{
		super(message);
	}
}

public class BankAccount 
{
	
		double ballance =55000;
	public double withdraw	(double amt) throws InsufficientBalanceException
	{
		
		
		if(amt>ballance  || amt<100 )
			
		{
			
			throw new InsufficientBalanceException("Assign a valid amount");
			
		}
		
		else
		{
		
		if(amt%500==0 || amt%100==0 || amt%200==0)
					{
						ballance-=amt ;
					}
		}
		System.out.println("Amount withdrawn:"+" "+amt);
		System.out.println("Remaining ballance "+" "+ballance);
		
		return ballance;
		
		}
		
		
	}


		
	
	


	
	
	


