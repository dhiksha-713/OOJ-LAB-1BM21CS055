/*Develop a Java program to create a class Bank that maintains two kinds of account for its customers, one called savings account 
and the other current account. The savings account provides compound interest and withdrawal facilities but no cheque book facility. 
The current account provides cheque book facility but no interest. Current account holders should also maintain a minimum balance 
and if the balance falls below this level, a service charge is imposed. 
Create a class Account that stores customer name, account number
and type of account. From this derive the classes Cur_acct and Sav_acct to
make them more specific to their requirements. Include the necessary methods in order to achieve the following tasks:

a)     Accept deposit from customer and update the
balance.
b)     Display the balance.
c)     Compute and deposit interest
d)     Permit withdrawal and update the balance

Check for the minimum balance, impose penalty if necessary and update the balance.*/



import java.util.Scanner;
import java.lang.Math;
class Account
{
	String name, acc_type;
	int acc_no;
	double bal,dep;
	Scanner ss= new Scanner(System.in);
	void setd()
	{
		System.out.println("Enter your Name:");
		name=ss.next();
		System.out.println("Enter your Account Number:");
		acc_no=ss.nextInt();
		System.out.println("Enter your Account type: (Savings/Current)");
		acc_type=ss.next();
		System.out.println("Enter the Bank Balance:");
		bal=ss.nextInt();
	}
	void disp()
	{
		System.out.println("Name: "+name);
		System.out.println("Account Number: "+acc_no);
		System.out.println("Account Type: "+acc_type);
		System.out.println("Current balance is: "+bal);
	}
	void deposit()
	{
		System.out.println("Enter the amount to be deposited:");
		dep=ss.nextInt();
		bal+=dep;
		System.out.println("Balance Amount: "+bal);
	}
}
class Cur_acct extends Account
{
	int penal()
	{
		double min, pen;
		min=5000; pen=min*0.05;
		if(bal<min)
		{
			bal-=pen;
			System.out.println("Penalty imposed for having insufficient balance"); return 0;
		}
		else
    		{
			System.out.println("No penalty");  
    			return 1;
		}
	}
	void withdrawal()
	{
		double amt;
		System.out.println("Enter amount to be withdrawn:");
		amt=ss.nextInt();
            int a= penal();
		if(a==1)
		{
			if(bal>=amt)
                	{ 
				bal=bal-amt;
				System.out.println("Account Balance after withdrawal is:" +bal);
			}
		}
		else
               	System.out.println("The amount can't be withdrawn");
      }
}
class Sav_acct extends Account
{
	void calc_interest()
	{
		System.out.println("Enter Time in years and Rate of interest");
		double t=ss.nextDouble(); 
		double r=ss.nextDouble();
		bal = bal*Math.pow((1 + r/ 100), t);
		System.out.println("Account Balance after compounding interest: "+ bal);
	}
	void withdrawal()
	{
		double amt;
		System.out.println("Enter amount to be withdrawn:");
		amt=ss.nextInt();
		if(bal>=amt)
            { 
			bal=bal-amt;
			System.out.println("Account Balance after withdrawal is:" +bal);
		}
		else
                  System.out.println("The amount can't be withdrawn");
      }
}
class Bank
{
  public static void main(String arg[])
  {
	Scanner ss=new Scanner(System.in);
	Account b1=new Account();
	b1.setd();
	if(b1.acc_type.equals("Savings"))
	{
		Sav_acct s1=new Sav_acct();
		s1.name=b1.name; s1.acc_no=b1.acc_no; s1.acc_type=b1.acc_type; s1.bal=b1.bal;
		while(true)
		{
			System.out.println("Enter your choice:\n1.Deposit\n2.Calculate interest\n3.Withdraw\n4.Display\n5.Exit");
			int choice=ss.nextInt();
			switch(choice)
			{
				case 1: s1.deposit(); break;
				case 2: s1.calc_interest(); break;
				case 3: s1.withdrawal(); break;
				case 4: s1.disp(); break;
				case 5: System.exit(0);
				default: System.out.println("Invalid input");
			}
		}
	}
	else if(b1.acc_type.equals("Current"))
	{
		Cur_acct c1=new Cur_acct();
		c1.name=b1.name; c1.acc_no=b1.acc_no; c1.acc_type=b1.acc_type; c1.bal=b1.bal;
		while(true)
		{
			System.out.println("Enter your choice:\n1.Deposit\n2.Penalty Check\n3.Withdraw\n4.Display\n5.Exit");
			int choice=ss.nextInt();
			switch(choice)
			{
				case 1: c1.deposit(); break;
				case 2: c1.penal(); break;
				case 3: c1.withdrawal(); break;
				case 4: c1.disp(); break;
				case 5: System.exit(0);
				default: System.out.println("Invalid input");
			}
		}
	}
	else
 		 System.out.println("Invalid Account type");
   }
}