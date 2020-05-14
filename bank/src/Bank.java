
import java.util.*;

public class Bank extends BankSystem
{
	private String accno;
	private String name;
	private long balance;

	Scanner KB=new Scanner(System.in);
	
	//method to open an account
	void openAccount()
	{ 
		System.out.print("Enter Account No: ");
		accno=KB.next();
		System.out.print("Enter Name: ");
		name=KB.next();
		System.out.print("Enter Balance: ");
		balance=KB.nextLong();
	}

	//method to display account details
	void showAccount()
	{ 
		System.out.println(accno+","+name+","+balance);
	}

	//method to deposit money
	@override
	void deposit()
	{
		long amt;
		System.out.println("Enter Amount U Want to Deposit : ");
		amt=KB.nextLong();
		balance=balance+amt;
	}

	//method to withdraw money
	
	@Override
	void withdraw() {
		// TODO Auto-generated method stub
		long amt;
		System.out.println("Enter Amount U Want to withdraw : ");
		amt=KB.nextLong();
		if(balance>=amt)
		{ 
			balance=balance-amt;
		}
		else
		{
			System.out.println("Less Balance..Transaction Failed..");
		}
		
	}
	//method to search an account number
		boolean search(String acn)
		{ 
			if(accno.equals(acn))
			{ 
				showAccount();
				return(true);
			}
			return(false);
		}

	@Override
	void interest() {
		// TODO Auto-generated method stub
		System.out.println("Interest for saving account");
		
	}
}

