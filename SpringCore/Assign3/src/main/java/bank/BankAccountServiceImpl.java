package bank;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class BankAccountServiceImpl implements BankAccountService {
	@Autowired
	private BankAccountRepository bankAccountRepository;
	double withdrawAmount;
	double depositAmount;
	int initialBalance = 100000;
	@Override
	public double withdraw(long accountId, double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
		System.out.println("The amount withdrawn is: " + withdrawAmount);
		return 0;
	}
	@Override
	public double deposit(long accountId, double depositAmount) {
		this.depositAmount = depositAmount;
		System.out.println("The amount deposited is: " + depositAmount);
		return 0;
	}
	@Override
	public double getBalance(long accountId) {
		return bankAccountRepository.getBalance(initialBalance);
	}
	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		return false;
	}
}
//class b1 implements BankAccountService
//{
//
//	public double withdraw(long accountId, double balance) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	public double deposit(long accountId, double balance) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	public double getBalance(long accountId) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	public boolean fundTransfer(long fromAccount, long toAccount, double amont) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//	
//}