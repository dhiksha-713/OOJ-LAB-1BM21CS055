/*Create a class Customer with the following specifications. 
Private Members:Customer_no, Customer_name, Qty , Price, TotalPrice, Discount, Netprice.
Methods: Public members:
      1. A parameterized constructor to assign initial
	2. Input( ) – to read data members. Call Caldiscount().
	3. Caldiscount ( ) – To calculate Discount according to TotalPrice and NetPrice
			TotalPrice = Price*Qty
			TotalPrice >=50000 – Discount 25% of TotalPrice
			TotalPrice >=25000 - Discount 10% of TotalPrice
			Netprice= TotalPrice-Discount
 	4. Show( ) – to display Customer details.                     
Develop a Java program to accept details of n
customers, calculate the discounts given to them and print their complete
details.*/


import java.util.Scanner;

class Customer
{
   private int Customer_no, Qty; 
   private String Customer_name;
   private double Price, TotalPrice, Discount, NetPrice;
   public Customer(String C_name,int C_no,int qty,double Pr)
   {
	Customer_no=C_no;
	Qty=qty;
	Customer_name=C_name;
	Price=Pr;
   }
   public double Caldiscount()
   {
	TotalPrice=Qty*Price;
	if(TotalPrice>=50000)
		Discount=0.25*TotalPrice;
	else if(TotalPrice>=25000)
		Discount=0.10*TotalPrice;
	else
		Discount=0;
	NetPrice=TotalPrice-Discount;
	return Discount;
   } 
   public void Show()
   {
	System.out.println("Customer Details:");
	Discount=Caldiscount();
	System.out.println("CUSTOMER NAME:"+Customer_name+"\nCUSTOMER NUMBER:"+Customer_no+"\nQUANTITY:"+Qty+"\nPRICE OF ITEM:"+Price+"\nDiscount availed:"+Discount+"\nTotal Price:"+TotalPrice+"\nNetPrice:"+NetPrice);
   }
}
class C_main
{
  public static void main(String args[])
  {
	Scanner ss=new Scanner(System.in);
	System.out.println("Enter number of Customers:");
	int n=ss.nextInt();
	Customer c1[]=new Customer[n];
	for(int i=0;i<n;i++)
	{	
		System.out.println("Enter Customer Name, Customer number, Quantity and Price of item");
		String C_name=ss.next();
		int C_no=ss.nextInt();
		int qty=ss.nextInt();
		double Pr=ss.nextDouble();
		c1[i]=new Customer(C_name,C_no,qty,Pr);
		c1[i].Show();		
	} 
  }
}