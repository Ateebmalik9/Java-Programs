class Bank{
	private int balance = 0;
	public void deposit(int amt)
	{
		balance += amt;
		System.out.println("you have made a deposit of "+ amt+" rupees");
	}
	public void withdraw(int amt)
	{
		if(balance>=amt)
		{
			balance -= amt;
			System.out.println("you have withdrawn "+ amt+" rupees");
		}
		else
			System.out.println("insufficient balance");
		
	}
	public void balanceEnquiryint amt)
	{
		System.out.println("you have a balance of "+ balance+" rupees");
	}
}

class deposit extends Thread{
	
}

class withdrawl extends Thread{
	
}

class Balance enquiry extends Thread{
	
}

class q5{
	public static void main(String[] args)
	{
		
	}

}
