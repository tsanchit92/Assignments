package bank;

import java.util.Scanner;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Repository
public class BankAccountRepositoryImpl implements BankAccountRepository {
	double withdrawAmount;
	double depositAmount;
	double initialBalance = 10000000;

	public double getBalance(long accountId) {
		System.out.println(initialBalance);
//		System.out.println("Enter the respective number please: 1.Deposit \n 2.Withdrawl");
//		Scanner sc = new Scanner(System.in);
//		int Deposit = sc.nextInt();
//		if (Deposit == 1) {
//			System.out.println(initialBalance + depositAmount);
//		} else
//			System.out.println(initialBalance - withdrawAmount);
			return 0;
	}

	public double updateBalance(long accountId, double newBalance) {
		newBalance = initialBalance + newBalance;

		System.out.println("The user's account balance is: " + newBalance);
		return 0;
	}
}
