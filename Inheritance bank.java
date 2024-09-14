import java.util.Scanner;
class BankAccount
{
	private double accountNumber, balance, interestRate;
	public void deposit(double amount)
	{
		balance=balance+ amount;
		System.out.println("Balance in bank: "+ balance);
	}
}
class SavingsAccount extends BankAccount
{
	private double minimumBalance;
	public void withdraw(double amount)
	{
		deposit(-amount);
		System.out.println("Amount credited: "+ amount);
	}
}

public class Bank
{
	public static void main(String[] args)
	{
		double amount;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter amount to be debited: ");
		amount=sc.nextDouble();
		BankAccount b = new BankAccount();
		b.deposit(amount);
		
		SavingsAccount s = new SavingsAccount();
		System.out.println("Enter amount to be debited: ");
		amount=sc.nextDouble();
		s.deposit(amount);
		
		System.out.println("Enter amount to be credited: ");
		amount=sc.nextDouble();
		s.withdraw(amount);
		
		
		
	}
}
