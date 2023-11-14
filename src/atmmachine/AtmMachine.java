package atmmachine;

import java.util.Scanner;

public class AtmMachine 
{
	int bal;
	int pin = 2001;

	public void menu() 
	{
		System.out.println("***** MENU *****");
		System.out.println("1.DEPOSIT");
		System.out.println("2.WITHDRAW");
		System.out.println("3.A/C BALANCE");
		System.out.println("4.EXIT");

		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		switch (ch) 
		{
		case 1:
			deposit();
			break;
		case 2:
			withdraw();
			break;
		case 3:
			accbal();
			break;
		case 4:
			exit();
			break;
		default:
			System.out.println("Enter the correct choice");
		}
		sc.close();
	}

	public void deposit() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pin");
		int enteredpin = sc.nextInt();

		if (pin==enteredpin) 
		{
			System.out.println("Enter the Amount to Deposit");
			int amt = sc.nextInt();
			bal = bal + amt;
			System.out.println("The amount deposited successful ");
			System.out.println("The balance is " + bal);
			menu();
		}
		else
		{
			System.out.println("Transaction Fail");
		}
        sc.close();
	}

	public void withdraw() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pin");
		int enteredpin = sc.nextInt();

		if (pin == enteredpin) 
		{
			System.out.println("Enter the Amount to Withdraw");
			int amt = sc.nextInt();
			if(amt>bal)
			{
				System.out.println("No Sufficient Balance");
				withdraw();
			}
			else 
			{
				bal = bal - amt;
				System.out.println("The amount withdraw successful");
				System.out.println("The balance is " + bal);
				menu();
			}
			
		}
		else
		{
			System.out.println("Transaction Fail");
		}
		sc.close();
	}
	
	
	public void accbal()
	{
		System.out.println("The Balance is "+bal);
	}
	
	public void exit()
	{
		System.out.println("Thank you");
	}

	//use of constructor
	AtmMachine() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pin");
		int enteredpin = sc.nextInt();

		if (pin == enteredpin) 
		{
			menu();
		}
		else
		{
			System.out.println("Please enter correct pin");
//			checkpin();
		}
		sc.close();
	}

	
	public static void main(String[] args) 
	{
		AtmMachine obj=new AtmMachine();
//		obj.checkpin();

	}

}
